"""Проверка каждой папки для защиты как отдельного Java-проекта."""
from pathlib import Path
import subprocess
import tempfile

ROOT = Path(__file__).resolve().parents[1]
NUMBERS = [8, 9, 10, 11, 13, 14]
CASES = {
    8: ("ru.mirea.lab8.task16.Main", "2\n5\n5\n0\n", "2"),
    9: ("ru.mirea.lab9.task01.Main", "", "Иван"),
    10: ("ru.mirea.lab10.task01.Main", "", "курс"),
    11: ("ru.mirea.lab11.task01.Main", "01.11.2026\n", "Дата"),
    13: ("ru.mirea.lab13.task06.Main", "words.txt\n", "кот тигр"),
    14: ("ru.mirea.lab14.task01.Main", "один,два;три\n", "один"),
}

def main():
    total = 0
    with tempfile.TemporaryDirectory(prefix="defense-check-") as output:
        for number in NUMBERS:
            folder = ROOT / "NA_ZASHCHITU" / f"praktika_{number:02}"
            sources = sorted((folder / "src").rglob("*.java"))
            assert sources, f"Нет Java-файлов в {folder}"
            for local in sources:
                original = ROOT / local.relative_to(folder)
                assert original.exists(), original
                assert local.read_bytes() == original.read_bytes(), f"Разные версии: {local}"

            destination = Path(output) / f"lab{number}"
            destination.mkdir()
            result = subprocess.run(
                ["javac", "--release", "17", "-encoding", "UTF-8",
                 "-Xlint:all", "-d", str(destination), *map(str, sources)],
                capture_output=True, text=True, timeout=60,
            )
            assert result.returncode == 0 and not result.stderr.strip(), (
                f"Практика {number}\n{result.stdout}\n{result.stderr}"
            )
            classname, data, expected = CASES[number]
            run = subprocess.run(
                ["java", "-Dfile.encoding=UTF-8", "-cp", str(destination), classname],
                input=data, cwd=folder, capture_output=True, text=True, timeout=10,
            )
            assert run.returncode == 0 and expected in run.stdout, (
                f"Практика {number}\n{run.stdout}\n{run.stderr}"
            )
            print(f"Практика {number}: {len(sources)} файлов, компиляция и запуск OK")
            total += len(sources)
    print(f"Проверено {len(NUMBERS)} отдельных папок и {total} Java-файлов")

if __name__ == "__main__":
    main()
