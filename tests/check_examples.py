"""Компиляция всех заданий, их запуск и проверки граничных случаев без внешних библиотек."""
from pathlib import Path
import ast
import re
import shutil
import subprocess
import tempfile

ROOT = Path(__file__).resolve().parents[1]
EXAMPLES = {
    **{f"ru.mirea.lab1.task{number:02}.Main": "" for number in range(1, 6)},
    **{f"ru.mirea.lab2.task{number:02}.Main": "" for number in range(1, 11)},
    "ru.mirea.lab3.random.task01.Main": "",
    "ru.mirea.lab3.random.task03.Main": "",
    "ru.mirea.lab3.random.task04.Main": "8\n",
    "ru.mirea.lab3.wrappers.task01.Main": "",
    "ru.mirea.lab3.wrappers.task02.Main": "",
    "ru.mirea.lab3.formatting.task01.Main": "",
    "ru.mirea.lab4.task01.Main": "",
    "ru.mirea.lab4.task02.Main": "admin\n1234\nЭлектроника\nНоутбук\n",
    "ru.mirea.lab6.Main": "",
    **{f"ru.mirea.lab7.{topic}.Main": "" for topic in ("movement", "math", "strings", "printing")},
}
EXAMPLES.update({
    "ru.mirea.lab1.task02.Main": "3\n-3\n-2\n-1\n",
    "ru.mirea.lab1.task05.Main": "0\n",
    "ru.mirea.lab2.task04.Main": "ASUS\nMSI\n",
    "ru.mirea.lab2.task08.Main": "3\none\ntwo\nthree\n",
    "ru.mirea.lab2.task09.Main": "2\n",
    "ru.mirea.lab2.task10.Main": "один    два\tтри\n",
})

def main():
    java = shutil.which("java")
    if not java:
        raise SystemExit("Нужен установленный JDK 17 или новее.")
    javac = shutil.which("javac")
    compiler = [javac] if javac else [java, "-m", "jdk.compiler/com.sun.tools.javac.Main"]
    sources = sorted((ROOT / "src").rglob("*.java"))
    with tempfile.TemporaryDirectory(prefix="praktika-tests-") as folder:
        output = Path(folder)
        result = subprocess.run(
            [*compiler, "--release", "17", "-encoding", "UTF-8", "-Xlint:all", "-d", str(output),
             *map(str, sources), str(ROOT / "tests/RegressionChecks.java")],
            capture_output=True, text=True, encoding="utf-8", timeout=60,
        )
        assert result.returncode == 0, result.stdout + result.stderr
        assert not result.stderr.strip(), "Предупреждения компилятора:\n" + result.stderr

        def run(class_name, input_text="", args=()):
            completed = subprocess.run(
                [java, "-Dfile.encoding=UTF-8", "-cp", str(output), class_name, *args],
                input=input_text, capture_output=True, text=True, encoding="utf-8", timeout=10,
            )
            assert completed.returncode == 0, class_name + ":\n" + completed.stderr
            assert not completed.stderr.strip(), class_name + ":\n" + completed.stderr
            return completed.stdout

        results = {name: run(name, text) for name, text in EXAMPLES.items()}
        assert len(results) == 28
        assert "Сумма: 55" in results["ru.mirea.lab1.task01.Main"]
        assert "Среднее: 5.5" in results["ru.mirea.lab1.task01.Main"]
        statistics = results["ru.mirea.lab1.task02.Main"]
        assert all(line in statistics for line in ["Сумма: -6", "Максимум: -1", "Минимум: -3"])
        assert run("ru.mirea.lab1.task03.Main", args=("first", "second")) == "first\nsecond\n"
        harmonic = results["ru.mirea.lab1.task04.Main"].splitlines()
        assert len(harmonic) == 10 and float(harmonic[0]) == 1 and float(harmonic[-1]) == 0.1
        assert "0! = 1" in results["ru.mirea.lab1.task05.Main"]
        assert "13! = 6227020800" in run("ru.mirea.lab1.task05.Main", args=("13",))
        assert "неотрицательных" in run("ru.mirea.lab1.task05.Main", args=("-1",))
        assert "целое число" in run("ru.mirea.lab1.task05.Main", args=("wrong",))

        corrected = run("ru.mirea.lab1.task02.Main", "bad\n2147483648\n2\n2147483647\n2147483647\n")
        assert "Сумма: 4294967294" in corrected
        positive_values = run("ru.mirea.lab1.task02.Main", "2\n100000\n200000\n")
        assert "Минимум: 100000" in positive_values
        zero_length = run("ru.mirea.lab1.task02.Main", "0\n1\n-5\n")
        assert "Сумма: -5" in zero_length and "Максимум: -5" in zero_length

        reversed_strings = results["ru.mirea.lab2.task08.Main"]
        assert "one two three" in reversed_strings and "three two one" in reversed_strings
        assert "Обратный массив" in run("ru.mirea.lab2.task08.Main", "0\n")
        assert "Слов: 3" in results["ru.mirea.lab2.task10.Main"]
        assert "Слов: 0" in run("ru.mirea.lab2.task10.Main", "   \n")

        for players in (2, 10):
            hands = run("ru.mirea.lab2.task09.Main", f"{players}\n")
            cards = re.findall(r"^  (.+)$", hands, re.M)
            assert len(cards) == players * 5 and len(set(cards)) == len(cards)
        rejected_players = run("ru.mirea.lab2.task09.Main", "11\n2\n")
        assert "Ошибка" in rejected_players and "Игрок 2:" in rejected_players

        arrays = [ast.literal_eval(line.split(": ", 1)[1]) for line in results["ru.mirea.lab3.random.task01.Main"].splitlines()]
        assert len(arrays) == 4
        assert arrays[1] == sorted(arrays[0]) and arrays[3] == sorted(arrays[2])
        assert all(len(values) == 10 and all(0 <= value < 100 for value in values) for values in arrays)
        increasing_output = results["ru.mirea.lab3.random.task03.Main"]
        increasing_values = list(map(int, increasing_output.splitlines()[0].split(": ", 1)[1].split()))
        assert len(increasing_values) == 4 and all(10 <= value <= 99 for value in increasing_values)
        increasing = all(left < right for left, right in zip(increasing_values, increasing_values[1:]))
        assert ("Массив строго возрастающий" in increasing_output) == increasing
        even_output = results["ru.mirea.lab3.random.task04.Main"].splitlines()
        original_values = list(map(int, even_output[0].split("Исходный массив: ", 1)[1].split()))
        even_values = list(map(int, even_output[1].split(": ", 1)[1].split()))
        assert len(original_values) == 8 and all(0 <= value <= 8 for value in original_values)
        assert even_values == [value for value in original_values if value % 2 == 0]

        assert "Покупка совершена. Товары: [Ноутбук]" in results["ru.mirea.lab4.task02.Main"]
        assert "Неверный логин/пароль" in run("ru.mirea.lab4.task02.Main", "wrong\nwrong\n")
        assert "Каталог не найден" in run("ru.mirea.lab4.task02.Main", "admin\n1234\nunknown\n")
        unknown_product = run("ru.mirea.lab4.task02.Main", "admin\n1234\nЭлектроника\nunknown\n")
        assert "Товар не найден" in unknown_product and "Покупка совершена" not in unknown_product

        interactive = [name for name, text in EXAMPLES.items() if text]
        for name in interactive:
            assert "Ввод завершён" in run(name), "Неправильно обработан конец ввода: " + name
        model_checks = run("RegressionChecks").strip()
        print(f"Компиляция {len(sources)} Java-файлов: без ошибок и предупреждений.")
        print("Все 28 примеров запускаются; консольные сценарии и конец ввода проверены.")
        print(model_checks)

if __name__ == "__main__":
    main()
