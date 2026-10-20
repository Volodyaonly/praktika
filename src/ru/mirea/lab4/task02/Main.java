package ru.mirea.lab4.task02;

import java.util.Scanner;

/** Практика 4: учебный интернет-магазин. */
public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Логин: ");
        if (!scanner.hasNextLine()) {
            System.out.println("Ввод завершён");
            return;
        }
        String login = scanner.nextLine();

        System.out.print("Пароль: ");
        if (!scanner.hasNextLine()) {
            System.out.println("Ввод завершён");
            return;
        }
        String password = scanner.nextLine();

        if (!shop.authenticate(login, password)) {
            System.out.println("Неверный логин/пароль");
            return;
        }
        System.out.println("Добро пожаловать!");
        shop.showCategories();

        System.out.print("Выберите каталог: ");
        if (!scanner.hasNextLine()) {
            System.out.println("Ввод завершён");
            return;
        }
        String category = scanner.nextLine().trim();
        if (!shop.showProducts(category)) {
            return;
        }

        System.out.print("Введите название товара для корзины: ");
        if (!scanner.hasNextLine()) {
            System.out.println("Ввод завершён");
            return;
        }
        String product = scanner.nextLine().trim();
        if (shop.addToCart(product)) {
            shop.checkout();
        }
    }
}
