import java.math.BigInteger;
import ru.mirea.lab2.task03.Circle;
import ru.mirea.lab2.task03.Point;
import ru.mirea.lab2.task03.Tester;
import ru.mirea.lab2.task07.Book;
import ru.mirea.lab2.task07.BookShelf;

/** Проверка основных и граничных случаев учебных заданий. */
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

        System.out.println("Проверок граничных случаев: " + checks);
    }
}
