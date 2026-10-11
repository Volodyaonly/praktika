package ru.mirea.lab1.task03;

/** Практика 1: аргументы командной строки. */
public class Main {
    public static void main(String[] args) {
        for (String argument : args) {
            System.out.println(argument);
        }
    }
}
