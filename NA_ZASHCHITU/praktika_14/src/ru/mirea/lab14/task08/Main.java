package ru.mirea.lab14.task08;

public class Main {
    public static Object[] filter(Object[] input, Filter rule) {
        int count = 0;
        for (int i = 0; i < input.length; i++) {
            if (rule.apply(input[i])) count++;
        }
        Object[] result = new Object[count];
        int j = 0;
        for (int i = 0; i < input.length; i++) {
            if (rule.apply(input[i])) {
                result[j] = input[i];
                j++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] words = {"кот", "слон", "дом", "машина"};
        Filter longWords = new Filter() {
            @Override
            public boolean apply(Object o) {
                return ((String) o).length() > 3;
            }
        };
        Object[] result = filter(words, longWords);
        for (Object word : result) System.out.println(word);
    }
}
