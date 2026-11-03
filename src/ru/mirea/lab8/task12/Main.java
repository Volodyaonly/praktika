package ru.mirea.lab8.task12;


import java.util.Scanner;

public class Main {
    static class Reader {
        Scanner sc = new Scanner(System.in);

        void printOdds() {
            if (!sc.hasNextInt()) return;
            int number = sc.nextInt();
            if (number == 0) return;
            if (number % 2 != 0) System.out.println(number);
            printOdds();
        }
    }
    public static void main(String[] args) {
        new Reader().printOdds();
    }
}
