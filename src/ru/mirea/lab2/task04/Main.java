package ru.mirea.lab2.task04;

import java.util.Scanner;

/** Практика 2, задание 4: магазин компьютеров. */
public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.addComputer(new Computer("Intel i5", 16, 512, "ASUS"));
        shop.addComputer(new Computer("AMD Ryzen 7", 32, 1024, "MSI"));
        shop.addComputer(new Computer("Intel i7", 8, 256, "HP"));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Все компьютеры в магазине:");
        shop.printAll();

        System.out.print("Введите марку для поиска: ");
        if (!scanner.hasNextLine()) {
            System.out.println("Ввод завершён");
            return;
        }
        String brand = scanner.nextLine().trim();
        Computer found = shop.findByBrand(brand);
        if (found != null) {
            System.out.println("Найден: " + found);
        } else {
            System.out.println("Компьютер не найден");
        }

        System.out.print("Введите марку для удаления: ");
        if (!scanner.hasNextLine()) {
            System.out.println("Ввод завершён");
            return;
        }
        String brandToRemove = scanner.nextLine().trim();
        shop.removeByBrand(brandToRemove);
        System.out.println("После удаления:");
        shop.printAll();
    }
}
