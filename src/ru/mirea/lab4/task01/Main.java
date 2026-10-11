package ru.mirea.lab4.task01;

/** Практика 4: Времена года. */
public class Main {
    public static void main(String[] args) {
        Season favorite = Season.SUMMER;
        System.out.println("Моё любимое время года: " + favorite
                + ", средняя температура: " + favorite.getAvgTemp()
                + ", описание: " + favorite.getDescription());
        printSeason(Season.WINTER);
        printSeason(Season.SUMMER);
        System.out.println("\nВсе времена года:");
        for (Season season : Season.values()) {
            System.out.println(season + " (" + season.getAvgTemp() + "°C): " + season.getDescription());
        }
    }
    static void printSeason(Season season) {
        switch (season) {
            case SUMMER: System.out.println("Я люблю лето"); break;
            case WINTER: System.out.println("Я люблю зиму"); break;
            case SPRING: System.out.println("Я люблю весну"); break;
            case AUTUMN: System.out.println("Я люблю осень"); break;
        }
    }
}
