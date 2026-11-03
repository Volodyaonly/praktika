package ru.mirea.lab8.task08;

import java.util.Scanner;

public class Main {
    public static boolean palindrome(String word, int left, int right) {
        if (left >= right) return true;
        if (word.charAt(left) != word.charAt(right)) return false;
        return palindrome(word, left + 1, right - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        System.out.println(palindrome(word, 0, word.length() - 1) ? "YES" : "NO");
    }
}
