package ru.mirea.lab14.task09;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String text = sc.nextLine().toLowerCase();
        String alphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        int[] count = new int[alphabet.length()];

        for (int i = 0; i < text.length(); i++) {
            int index = alphabet.indexOf(text.charAt(i));
            if (index >= 0) count[index]++;
        }

        for (int i = 0; i < alphabet.length(); i++) {
            if (count[i] > 0) {
                System.out.println(alphabet.charAt(i) + ": " + count[i]);
            }
        }
    }
}
