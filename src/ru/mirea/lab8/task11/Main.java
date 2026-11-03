package ru.mirea.lab8.task11;


import java.util.Scanner;

public class Main {
    static class Reader {
        Scanner sc = new Scanner(System.in);

        int countOnes() {
            if (!sc.hasNextInt()) return 0;
            int number = sc.nextInt();
            if (number == 0) {
                if (!sc.hasNextInt()) return 0;
                int next = sc.nextInt();
                if (next == 0) return 0;
                return (next == 1 ? 1 : 0) + countOnes();
            }
            return (number == 1 ? 1 : 0) + countOnes();
        }
    }
    public static void main(String[] args) {
        System.out.println(new Reader().countOnes());
    }
}
