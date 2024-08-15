package com.example.demo;

import java.util.List;

public class Main {

    public static void main(String[] args) {

    }

    /**
     * Returns a non blank string.
     *
     * @return a non blank string
     */
    public static String createNotBlankString() {
        return null;
    }

    /**
     * Returns the maximum element of the array.
     *
     * @param numbers is an array of integers
     * @return maximum element of the array
     * @throws IllegalArgumentException if the array is null or empty
     */
    public static int findMax(int[] numbers) {
        return 0;
    }

    /**
     * Modifies given list as follows:
     * 1. If a string is null or empty it is discarded
     * 2. The first letter of every string will be in uppercase and the rest in lowercase (ex. "foobaR" -> "Foobar")
     * 3. If a string contains trailing spaces these are removed (ex. " FooBar " -> "Foobar")
     *
     * @param strings is a list of strings
     * @return a list of strings that have the first letter in uppercase and the rest in lowercase
     */
    public static List<String> formatFirstInCapital(List<String> strings) {
        return null;
    }

    /**
     * Filters given list of Fruits discarding all fruits which prices exceeds the given price.
     * The result list is ordered by price in ascending order.
     *
     * @param fruits list of fruits
     * @param price  target price
     * @return ordered list of fruits by price not containing fruits that exceeds the target price
     * @throws IllegalArgumentException if the list is null
     */
    public static List<Fruit> filterFruitsByPrice(List<Fruit> fruits, double price) {
        return null;
    }
}
