package ru.mirea.lab8.task17;


import java.util.Scanner;

public class Main {
    static class Reader {
        Scanner sc = new Scanner(System.in);

        int maximum() {
            if (!sc.hasNextInt()) return 0;
            int number = sc.nextInt();
            if (number == 0) return 0;
            int next = maximum();
            return number > next ? number : next;
        }
    }
    public static void main(String[] args) {
        System.out.println(new Reader().maximum());
    }
}
