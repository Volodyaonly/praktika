package ru.mirea.lab4.task01;

public enum Season {
    WINTER(-5),
    SPRING(10),
    SUMMER(25) {
        @Override
        public String getDescription() {
            return "Тёплое время года";
        }
    },
    AUTUMN(8);
    private final int averageTemperature;
    Season(int averageTemperature) {
        this.averageTemperature = averageTemperature;
    }
    public int getAvgTemp() {
        return averageTemperature;
    }
    public String getDescription() {
        return "Холодное время года";
    }
}
