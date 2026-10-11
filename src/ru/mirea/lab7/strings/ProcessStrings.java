package ru.mirea.lab7.strings;

public class ProcessStrings implements StringProcessing {
    @Override
    public int countChars(String value) {
        return value.codePointCount(0, value.length());
    }

    @Override

    public String oddPositions(String value) {
        StringBuilder result = new StringBuilder();
        // Считаем позиции с единицы и не разрываем символы вроде эмодзи.
        int[] characters = value.codePoints().toArray();
        for (int index = 0; index < characters.length; index += 2) {
            result.appendCodePoint(characters[index]);
        }
        return result.toString();
    }

    @Override

    public String reverse(String value) {
        return new StringBuilder(value).reverse().toString();
    }
}
