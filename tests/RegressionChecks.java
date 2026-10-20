import java.math.BigInteger;
import ru.mirea.common.movement.MovablePoint;
import ru.mirea.common.movement.MovableRectangle;
import ru.mirea.lab2.task03.Circle;
import ru.mirea.lab2.task03.Point;
import ru.mirea.lab2.task03.Tester;
import ru.mirea.lab2.task05.Dog;
import ru.mirea.lab2.task07.Book;
import ru.mirea.lab2.task07.BookShelf;
import ru.mirea.lab7.math.MathFunc;
import ru.mirea.lab7.strings.ProcessStrings;

/** Проверки ошибок, которые не обнаруживаются одним запуском демонстрационных данных. */
public class RegressionChecks {
    private static int checks;

    private static void check(boolean condition, String message) {
        if (!condition) {
            System.out.println("Ошибка проверки: " + message);
            System.exit(1);
        }
        checks++;
    }

    public static void main(String[] args) {
        check(ru.mirea.lab1.task05.Main.factorial(0).equals(BigInteger.ONE), "0! должен равняться 1");
        check(ru.mirea.lab1.task05.Main.factorial(13).equals(new BigInteger("6227020800")), "13! не должен переполнять int");

        BookShelf emptyShelf = new BookShelf(0);
        emptyShelf.addBook(new Book("Автор", "Лишняя", 1999));
        check(emptyShelf.getEarliest() == null && emptyShelf.getLatest() == null, "Пустая полка должна возвращать null");
        Book book = new Book("Автор", "Книга", 2000);
        BookShelf fullShelf = new BookShelf(1);
        fullShelf.addBook(book);
        fullShelf.addBook(new Book("Другой автор", "Другая книга", 2010));
        check(fullShelf.getLatest() == book, "Переполнение полки не должно заменять книгу");

        Circle small = new Circle(new Point(0, 0), 1);
        Circle large = new Circle(new Point(0, 0), 5);
        Circle[] circles = {large, small};
        Tester tester = new Tester(circles, circles.length);
        check(tester.findSmallest() == small && tester.findLargest() == large, "Неправильный выбор окружности");
        tester.sortByRadius();
        check(circles[0] == small && circles[1] == large, "Неправильная сортировка окружностей");

        MovablePoint point = new MovablePoint(5, 5, 2, 3);
        point.moveUp();
        point.moveRight();
        check(point.getX() == 7 && point.getY() == 8, "Скорость движения не учтена");
        point.moveDown();
        point.moveLeft();
        check(point.getX() == 5 && point.getY() == 5, "Обратное движение должно возвращать точку");
        MovableRectangle rectangle = new MovableRectangle(0, 0, 10, 10, 2, 3);
        rectangle.moveUp();
        rectangle.moveRight();
        check(rectangle.speedTest(), "Углы прямоугольника должны двигаться с одной скоростью");

        MathFunc calculator = new MathFunc();
        check(calculator.modulus(3, 4) == 5, "Модуль числа (3, 4) должен равняться 5");
        double largeModulus = calculator.modulus(1e308, 1e308);
        check(Double.isFinite(largeModulus) && Math.abs(largeModulus / 1e308 - Math.sqrt(2)) < 1e-12, "Модуль не должен переполняться при возведении в квадрат");

        ProcessStrings processor = new ProcessStrings();
        check(processor.countChars("A😀Б") == 3, "Эмодзи должен считаться одним символом");
        check(processor.oddPositions("A😀Б").equals("AБ"), "Нечётные позиции считаются с единицы");
        check(processor.oddPositions("😀AБ").equals("😀Б"), "Эмодзи нельзя разрывать на половины");
        check(processor.reverse("A😀Б").equals("Б😀A"), "Разворот должен сохранять эмодзи");
        check(processor.countChars("") == 0 && processor.oddPositions("").isEmpty() && processor.reverse("").isEmpty(), "Пустая строка должна обрабатываться");

        System.out.println("Проверок граничных случаев: " + checks);
    }
}
