package ru.mirea.lab13.task03;

import java.util.StringTokenizer;

public class Address {
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String building;
    private String apartment;

    private void save(String[] parts) {
        country = parts[0];
        region = parts[1];
        city = parts[2];
        street = parts[3];
        house = parts[4];
        building = parts[5];
        apartment = parts[6];
    }

    public void parseComma(String text) {
        String[] input = text.split(",", -1);
        String[] parts = new String[7];
        for (int i = 0; i < parts.length; i++) {
            parts[i] = i < input.length ? input[i].trim() : "";
        }
        save(parts);
    }

    public void parseAnySeparator(String text) {
        StringTokenizer tokenizer = new StringTokenizer(text, ",.;");
        String[] parts = new String[7];
        for (int i = 0; i < parts.length; i++) {
            if (tokenizer.hasMoreTokens()) parts[i] = tokenizer.nextToken().trim();
            else parts[i] = "";
        }
        save(parts);
    }

    @Override
    public String toString() {
        return "Страна: " + country + ", регион: " + region + ", город: " + city
             + ", улица: " + street + ", дом: " + house
             + ", корпус: " + building + ", квартира: " + apartment;
    }
}
