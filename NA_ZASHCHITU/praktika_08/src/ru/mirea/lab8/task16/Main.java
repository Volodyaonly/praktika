package ru.mirea.lab8.task16;


import java.util.Scanner;

public class Main {
    static class Reader {
        Scanner sc = new Scanner(System.in);

        int[] findMaximum() {
            if (!sc.hasNextInt()) return new int[] {0, 0};
            int number = sc.nextInt();
            if (number == 0) return new int[] {0, 0};
            int[] result = findMaximum();
            if (number > result[0]) {
                result[0] = number;
                result[1] = 1;
            } else if (number == result[0]) {
                result[1]++;
            }
            return result;
        }
    }
    public static void main(String[] args) {
        int[] answer = new Reader().findMaximum();
        System.out.println(answer[1]);
    }
}
