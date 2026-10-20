package ru.mirea.lab4.task02;

public class Shop {
    private final String[][] products = {
            {"Ноутбук", "Смартфон", "Наушники"},
            {"Футболка", "Джинсы", "Куртка"},
            {"Хлеб", "Молоко", "Сыр"}
    };
    private final String[] categories = {"Электроника", "Одежда", "Продукты"};
    private String[] cart = new String[10];
    private int cartCount = 0;

    /** Учебные данные для входа: admin / 1234. */
    public boolean authenticate(String login, String password) {
        return "admin".equals(login) && "1234".equals(password);
    }

    public void showCategories() {
        System.out.println("Каталоги:");
        for (int i = 0; i < categories.length; i++) {
            System.out.println("- " + categories[i]);
        }
    }

    public boolean showProducts(String category) {
        for (int i = 0; i < categories.length; i++) {
            if (categories[i].equalsIgnoreCase(category)) {
                System.out.println("Товары в каталоге " + category + ":");
                for (int j = 0; j < products[i].length; j++) {
                    System.out.println("  " + products[i][j]);
                }
                return true;
            }
        }
        System.out.println("Каталог не найден");
        return false;
    }

    public boolean addToCart(String product) {
        for (int i = 0; i < products.length; i++) {
            for (int j = 0; j < products[i].length; j++) {
                if (products[i][j].equalsIgnoreCase(product)) {
                    if (cartCount == cart.length) {
                        String[] bigger = new String[cart.length * 2];
                        for (int k = 0; k < cartCount; k++) {
                            bigger[k] = cart[k];
                        }
                        cart = bigger;
                    }
                    cart[cartCount] = products[i][j];
                    cartCount++;
                    System.out.println("Товар добавлен в корзину: " + products[i][j]);
                    return true;
                }
            }
        }
        System.out.println("Товар не найден");
        return false;
    }

    public void checkout() {
        if (cartCount == 0) {
            System.out.println("Корзина пуста");
        } else {
            System.out.print("Покупка совершена. Товары: [");
            for (int i = 0; i < cartCount; i++) {
                if (i > 0) {
                    System.out.print(", ");
                }
                System.out.print(cart[i]);
            }
            System.out.println("]");
        }
    }
}
