package ru.mirea.lab2.task09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import ru.mirea.common.ConsoleInput;

/** Практика 2, задание 9: раздача карт. */
public class Main {
    private static final int CARDS_PER_PLAYER = 5;

    public static void main(String[] args) {
        String[] suits = {"Пики", "Черви", "Бубны", "Трефы"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "В", "Д", "К", "Т"};
        ArrayList<String> deck = new ArrayList<>();
        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(rank + " " + suit);
            }
        }
        Collections.shuffle(deck);

        try (Scanner scanner = new Scanner(System.in)) {
            int maximumPlayers = deck.size() / CARDS_PER_PLAYER;
            int players = ConsoleInput.readInt(scanner, "Введите число игроков: ", 1, maximumPlayers);
            int nextCard = 0;
            for (int player = 1; player <= players; player++) {
                System.out.println("Игрок " + player + ":");
                for (int card = 0; card < CARDS_PER_PLAYER; card++) {
                    System.out.println("  " + deck.get(nextCard++));
                }
                System.out.println();
            }
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
