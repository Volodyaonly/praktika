package ru.mirea.lab14.task03;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        // Цена: целая часть, точка, ровно две цифры и валюта.
        Pattern pattern = Pattern.compile("(?<![0-9.])\\d+\\.\\d{2}\\s+(USD|RUB|EU)\\b");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) System.out.println(matcher.group());
    }
}
