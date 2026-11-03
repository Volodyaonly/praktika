package ru.mirea.lab8.task13;


public class Main {
    static class Reader {
        Scanner sc = new Scanner(System.in);

        void printOddPositions() {
            if (!sc.hasNextInt()) return;
            int first = sc.nextInt();
            if (first == 0) return;
            System.out.println(first);
            if (!sc.hasNextInt()) return;
            int second = sc.nextInt();
            if (second != 0) printOddPositions();
        }
    }
    public static void main(String[] args) {
        new Reader().printOddPositions();
    }
}
