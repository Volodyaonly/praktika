package ru.mirea.lab4.task02;

import java.util.ArrayList;

public class Shop {
    private final String[][] products = {
            {"Ноутбук", "Смартфон", "Наушники"},
            {"Футболка", "Джинсы", "Куртка"},
            {"Хлеб", "Молоко", "Сыр"}
    };
    private final String[] categories = {"Электроника", "Одежда", "Продукты"};
    private final ArrayList<String> cart = new ArrayList<>();
    /** Учебные данные для демонстрации входа: admin / 1234. */
    public boolean authenticate(String login, String password) {
        return "admin".equals(login) && "1234".equals(password);
    }
    public void showCategories() {
        System.out.println("Каталоги:");
        for (String categoryName : categories) System.out.println("- " + categoryName);
    }
    public boolean showProducts(String category) {
        for (int i = 0; i < categories.length; i++) {
            if (categories[i].equalsIgnoreCase(category)) {
                System.out.println("Товары в каталоге " + category + ":");
                for (String productName : products[i]) System.out.println("  " + productName);
                return true;
            }
        }
        System.out.println("Каталог не найден");
        return false;
    }
    public boolean addToCart(String product) {
        for (String[] categoryProducts : products)
            for (String productName : categoryProducts)
                if (productName.equalsIgnoreCase(product)) {
                    cart.add(productName);
                    System.out.println("Товар добавлен в корзину: " + productName);
                    return true;
                }
        System.out.println("Товар не найден");
        return false;
    }
    public void checkout() {
        if (cart.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println("Покупка совершена. Товары: " + cart);
        }
    }
}
