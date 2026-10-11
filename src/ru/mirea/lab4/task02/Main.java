package ru.mirea.lab4.task02;

import java.util.Scanner;
import ru.mirea.common.ConsoleInput;

/** Практика 4: учебный интернет-магазин. */
public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        try (Scanner scanner = new Scanner(System.in)) {
            String login = ConsoleInput.readLine(scanner, "Логин: ");
            String password = ConsoleInput.readLine(scanner, "Пароль: ");
            if (!shop.authenticate(login, password)) {
                System.out.println("Неверный логин/пароль");
                return;
            }
            System.out.println("Добро пожаловать!");
            shop.showCategories();
            String category = ConsoleInput.readLine(scanner, "Выберите каталог: ").trim();
            if (!shop.showProducts(category)) {
                return;
            }
            String product = ConsoleInput.readLine(scanner, "Введите название товара для корзины: ").trim();
            if (shop.addToCart(product)) {
                shop.checkout();
            }
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
