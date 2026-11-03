"""Tests for the new Java practices."""
from pathlib import Path
import subprocess
import tempfile

ROOT = Path(__file__).resolve().parents[1]
CASES = {
    "lab8.task01": ("6\n", "1 2 2 3 3 3"),
    "lab8.task02": ("4\n", "1 2 3 4"),
    "lab8.task03": ("5\n2\n", "5 4 3 2"),
    "lab8.task04": ("2\n2\n", "2"),
    "lab8.task05": ("1234\n", "10"),
    "lab8.task06": ("17\n", "YES"),
    "lab8.task07": ("12\n", "2 2 3"),
    "lab8.task08": ("level\n", "YES"),
    "lab8.task09": ("2\n2\n", "3"),
    "lab8.task10": ("1234\n", "4321"),
    "lab8.task11": ("1\n0\n1\n1\n0\n0\n", "3"),
    "lab8.task12": ("1\n2\n3\n0\n", "1 3"),
    "lab8.task13": ("2\n3\n4\n5\n6\n0\n", "2 4 6"),
    "lab8.task14": ("123\n", "1 2 3"),
    "lab8.task15": ("123\n", "3 2 1"),
    "lab8.task16": ("2\n5\n5\n1\n0\n", "2"),
    "lab8.task17": ("2\n5\n5\n1\n0\n", "5"),
    "lab9.task01": ("", "2 Иван"),
    "lab9.task02": ("", "2 Мария"),
    "lab9.task03": ("", "1 Иван"),
    "lab9.task04": ("", "Результат сравнения: -1"),
    "lab10.task01": ("", "Новый курс: 3"),
    "lab10.task02": ("", "Сортировка по фамилии"),
    "lab10.task03": ("", "Иванова Мария"),
    "lab11.task01": ("03.11.2026\n", "Разработчик: Овсянников"),
    "lab11.task02": ("2000 1 1\n", "раньше текущей"),
    "lab11.task03": ("", "Короткий формат"),
    "lab11.task04": ("2025 5 20\n13 45\n", "Calendar:"),
    "lab11.task05": ("", "LinkedList: удаление"),
    "lab13.task01": ("", "Подстрока Java: Java"),
    "lab13.task02": ("", "Петров И.С."),
    "lab13.task03": ("", "квартира: 6"),
    "lab13.task04": ("", "Артикул: S011"),
    "lab13.task05": ("", "+7917-565-5655"),
    "lab13.task06": ("tests/words_chain_example.txt\n", "кот тигр рак книга автобус"),
    "lab14.task01": ("один,два;три\n", "один два три"),
    "lab14.task02": ("abcdefghijklmnopqrstuv18340\n", "true"),
    "lab14.task03": ("25.98 USD; 44 ERR, 0.004 EU\n", "25.98 USD"),
    "lab14.task04": ("1+\n", "false"),
    "lab14.task05": ("29/02/2000\n", "true"),
    "lab14.task06": ("root@localhost\n", "true"),
    "lab14.task07": ("F032_Password\n", "true"),
    "lab14.task08": ("", "слон машина"),
    "lab14.task09": ("мама\n", "а: 2"),
}
EXTRA = [
    ("lab8.task06", "18\n", "NO"),
    ("lab8.task08", "abc\n", "NO"),
    ("lab14.task02", "somethingelse\n", "false"),
    ("lab14.task05", "29/02/2001\n", "false"),
    ("lab14.task05", "30/04/2003\n", "true"),
    ("lab14.task06", "myhost@@@com.ru\n", "false"),
    ("lab14.task07", "smart_pass\n", "false"),
    ("lab14.task07", "A007\n", "false"),
]

def main():
    sources = sorted((ROOT / "src").rglob("*.java"))
    with tempfile.TemporaryDirectory() as output:
        compilation = subprocess.run(
            ["javac", "--release", "17", "-encoding", "UTF-8", "-Xlint:all",
             "-d", output, *map(str, sources)],
            cwd=ROOT, capture_output=True, text=True, timeout=60,
        )
        assert compilation.returncode == 0, compilation.stderr
        assert compilation.stderr == "", compilation.stderr

        def run(task, data):
            process = subprocess.run(
                ["java", "-Dfile.encoding=UTF-8", "-cp", output, "ru.mirea." + task + ".Main"],
                input=data, cwd=ROOT, capture_output=True, text=True,
                encoding="utf-8", timeout=12,
            )
            assert process.returncode == 0, (task, process.stderr)
            return process.stdout.strip()

        for task, (data, expected) in CASES.items():
            result = run(task, data)
            assert expected in " ".join(result.split()), (task, result, expected)
        for task, data, expected in EXTRA:
            result = run(task, data)
            assert expected in result, (task, result, expected)

    print(f"Compiled {len(sources)} Java source files without warnings")
    print(f"New practices: {len(CASES)} task programs OK, {len(EXTRA)} extra checks OK")

if __name__ == "__main__":
    main()
