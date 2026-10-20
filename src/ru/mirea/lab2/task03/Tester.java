package ru.mirea.lab2.task03;

public class Tester {
    private Circle[] circles;
    private int circleCount;
    public Tester(Circle[] circles, int circleCount) {
        this.circles = circles;
        this.circleCount = circleCount;
    }
    public Circle findSmallest() {
        Circle smallest = circles[0];
        for (int index = 1; index < circleCount; index++)
            if (circles[index].getRadius() < smallest.getRadius()) smallest = circles[index];
        return smallest;
    }
    public Circle findLargest() {
        Circle largest = circles[0];
        for (int index = 1; index < circleCount; index++)
            if (circles[index].getRadius() > largest.getRadius()) largest = circles[index];
        return largest;
    }
    public void sortByRadius() {
        for (int index = 0; index < circleCount - 1; index++)
            for (int indexToCompare = 0; indexToCompare < circleCount - index - 1; indexToCompare++)
                if (circles[indexToCompare].getRadius() > circles[indexToCompare + 1].getRadius()) {
                    Circle temporaryCircle = circles[indexToCompare];
                    circles[indexToCompare] = circles[indexToCompare + 1];
                    circles[indexToCompare + 1] = temporaryCircle;
                }
    }
}
