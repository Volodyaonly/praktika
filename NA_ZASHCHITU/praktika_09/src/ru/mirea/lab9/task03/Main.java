package ru.mirea.lab9.task03;

import ru.mirea.lab9.Student;

public class Main {
    public static Student[] merge(Student[] first, Student[] second) {
        Student[] result = new Student[first.length + second.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < first.length && j < second.length) {
            if (first[i].compareTo(second[j]) <= 0) result[k++] = first[i++];
            else result[k++] = second[j++];
        }
        while (i < first.length) result[k++] = first[i++];
        while (j < second.length) result[k++] = second[j++];
        return result;
    }

    public static void main(String[] args) {
        // Оба исходных массива уже отсортированы по ID.
        Student[] first = {new Student(1, "Иван", 4.5), new Student(3, "Анна", 4.8)};
        Student[] second = {new Student(2, "Олег", 4.0), new Student(4, "Мария", 5.0)};
        Student[] result = merge(first, second);
        for (Student student : result) System.out.println(student);
    }
}
