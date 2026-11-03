package ru.mirea.lab10;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {
    private Student[] iDNumber;

    public void setArray(Student[] students) {
        iDNumber = students;
    }

    public void outArray() {
        for (Student student : iDNumber) System.out.println(student);
    }

    @Override
    public int compare(Student a, Student b) {
        if (a.getGpa() > b.getGpa()) return -1;
        if (a.getGpa() < b.getGpa()) return 1;
        return 0;
    }

    public void quicksort() {
        if (iDNumber.length > 1) quicksort(0, iDNumber.length - 1);
    }

    private void quicksort(int left, int right) {
        int i = left;
        int j = right;
        Student middle = iDNumber[(left + right) / 2];
        while (i <= j) {
            while (compare(iDNumber[i], middle) < 0) i++;
            while (compare(iDNumber[j], middle) > 0) j--;
            if (i <= j) {
                Student temp = iDNumber[i];
                iDNumber[i] = iDNumber[j];
                iDNumber[j] = temp;
                i++;
                j--;
            }
        }
        if (left < j) quicksort(left, j);
        if (i < right) quicksort(i, right);
    }

    public void mergeSort() {
        if (iDNumber.length > 1) mergeSort(0, iDNumber.length - 1);
    }

    private void mergeSort(int left, int right) {
        if (left >= right) return;
        int middle = (left + right) / 2;
        mergeSort(left, middle);
        mergeSort(middle + 1, right);
        Student[] temp = new Student[right - left + 1];
        int i = left;
        int j = middle + 1;
        int k = 0;
        while (i <= middle && j <= right) {
            if (compare(iDNumber[i], iDNumber[j]) <= 0) temp[k++] = iDNumber[i++];
            else temp[k++] = iDNumber[j++];
        }
        while (i <= middle) temp[k++] = iDNumber[i++];
        while (j <= right) temp[k++] = iDNumber[j++];
        for (int t = 0; t < temp.length; t++) iDNumber[left + t] = temp[t];
    }

    public void sortBySurname() {
        for (int i = 0; i < iDNumber.length - 1; i++) {
            for (int j = 0; j < iDNumber.length - i - 1; j++) {
                if (iDNumber[j].getLastName().compareTo(iDNumber[j + 1].getLastName()) > 0) {
                    Student temp = iDNumber[j];
                    iDNumber[j] = iDNumber[j + 1];
                    iDNumber[j + 1] = temp;
                }
            }
        }
    }
}
