package ru.mirea.lab9;

public class Student implements Comparable<Student> {
    private int id;
    private String name;
    private double gpa;

    public Student(int id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    public int getId() { return id; }
    public double getGpa() { return gpa; }

    @Override
    public int compareTo(Student other) {
        if (id < other.id) return -1;
        if (id > other.id) return 1;
        return 0;
    }

    @Override
    public String toString() {
        return id + " " + name + " (" + gpa + ")";
    }
}
