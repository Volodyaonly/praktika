package ru.mirea.lab13.task06;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    // Каждый раз выбираем слово, начинающееся с последней буквы предыдущего.
    public static boolean build(String[] words, boolean[] used, StringBuilder result,
                                int count, String lastWord) {
        if (count == words.length) return true;
        for (int i = 0; i < words.length; i++) {
            if (used[i]) continue;
            if (lastWord.length() > 0) {
                char last = Character.toLowerCase(lastWord.charAt(lastWord.length() - 1));
                char first = Character.toLowerCase(words[i].charAt(0));
                if (last != first) continue;
            }
            int oldLength = result.length();
            if (count > 0) result.append(' ');
            result.append(words[i]);
            used[i] = true;
            if (build(words, used, result, count + 1, words[i])) return true;
            used[i] = false;
            result.setLength(oldLength);
        }
        return false;
    }

    public static String getLine(String[] words) {
        StringBuilder result = new StringBuilder();
        if (build(words, new boolean[words.length], result, 0, "")) return result.toString();
        return "Цепочку из всех слов составить нельзя";
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Имя файла: ");
        String filename = keyboard.nextLine();
        File file = new File(filename);
        if (!file.exists()) {
            System.out.println("Файл не найден");
            return;
        }

        Scanner sc = new Scanner(file, "UTF-8");
        int count = 0;
        while (sc.hasNext()) {
            sc.next();
            count++;
        }
        sc.close();

        String[] words = new String[count];
        sc = new Scanner(file, "UTF-8");
        for (int i = 0; i < count; i++) words[i] = sc.next();
        sc.close();
        System.out.println(getLine(words));
    }
}
