package ru.mirea.lab2.task09;

import java.util.Scanner;

/** Практика 2, задание 9: раздача карт. */
public class Main {
    public static void main(String[] args) {
        String[] suits = {"Пики", "Черви", "Бубны", "Трефы"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "В", "Д", "К", "Т"};
        String[] deck = new String[52];

        int index = 0;
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                deck[index] = ranks[j] + " " + suits[i];
                index++;
            }
        }

        // Перемешиваем колоду, меняя две карты местами.
        for (int i = deck.length - 1; i > 0; i--) {
            int randomIndex = (int) (Math.random() * (i + 1));
            String temporary = deck[i];
            deck[i] = deck[randomIndex];
            deck[randomIndex] = temporary;
        }

        Scanner scanner = new Scanner(System.in);
        int players;
        while (true) {
            System.out.print("Введите число игроков (от 1 до 10): ");
            if (!scanner.hasNext()) {
                System.out.println("Ввод завершён");
                return;
            }
            if (!scanner.hasNextInt()) {
                scanner.next();
                System.out.println("Ошибка: нужно ввести целое число");
                continue;
            }
            players = scanner.nextInt();
            if (players >= 1 && players <= 10) {
                break;
            }
            System.out.println("Ошибка: число игроков должно быть от 1 до 10");
        }

        int nextCard = 0;
        for (int player = 1; player <= players; player++) {
            System.out.println("Игрок " + player + ":");
            for (int card = 0; card < 5; card++) {
                System.out.println("  " + deck[nextCard]);
                nextCard++;
            }
            System.out.println();
        }
    }
}
