package com.example.demo;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Tests {

    @Test
    @DisplayName("Test that createNotBlankString returns a non blank String")
    void testCreateNotBlankString() {
        //when
        String actual = Main.createNotBlankString();

        //then
        assertTrue(StringUtils.isNotBlank(actual), "The string should not be blank");
    }

    @Test
    @DisplayName("Test that findMax throws an exception if the array is null")
    void testFindMaxNullException() {
        assertThrows(IllegalArgumentException.class, () -> Main.findMax(null), "The array should not be null");
    }

    @Test
    @DisplayName("Test that findMax throws an exception if the array is empty")
    void testFindMaxEmptyException() {
        assertThrows(IllegalArgumentException.class, () -> Main.findMax(new int[0]), "The array should not be empty");
    }

    @Test
    @DisplayName("Test that findMax returns the biggest number of the array")
    void testFindMax() {
        //given
        int[] array = {1, 0, -3, 5, 7};

        //when
        int actual = Main.findMax(array);

        //then
        assertEquals(7, actual, "The max value should be 7");
    }

    @Test
    @DisplayName("Test that formatFirstInCapital returns a null if the list is null")
    void testNullFormatFirstInCapital() {

        //when
        List<String> actual = Main.formatFirstInCapital(null);

        //then
        assertNull(actual, "The list should be null");
    }

    @Test
    @DisplayName("Test that formatFirstInCapital returns an empty list if the list is empty")
    void testEmptyFormatFirstInCapital() {
        //given
        List<String> emptyList = List.of();

        //when
        List<String> actual = Main.formatFirstInCapital(emptyList);

        //then
        assertEquals(emptyList, actual, "The list should be empty");
    }

    @Test
    @DisplayName("Test that formatFirstInCapital returns a list of strings with a first letter in uppercase")
    void testFormatFirstInCapital() {
        //given
        List<String> strings = new ArrayList<>();
        strings.add("foo");
        strings.add("BAR");
        strings.add(null);
        strings.add("");
        strings.add("foo bar");
        strings.add(" foobar");
        strings.add(" fooBarBar  ");

        List<String> formattedStringList = List.of("Foo", "Bar", "Foo bar", "Foobar", "Foobarbar");

        //when
        List<String> actual = Main.formatFirstInCapital(strings);

        //then
        assertEquals(formattedStringList, actual, "The list should contain only strings with a first letter in uppercase. (Without null or empty strings)");
    }

    @Test
    @DisplayName("Test that filterFruitsByPrice throws an exception if the list is null")
    void testNullFilterFruitsByPrice() {
        assertThrows(IllegalArgumentException.class, () -> Main.filterFruitsByPrice(null, 0.0), "The array should not be null");
    }


    @Test
    @DisplayName("Test that filterFruitsByPrice returns an ordered list by target price without fruits that exceed the target price")
    void testFilterFruitsByPrice() {
        //given
        List<Fruit> fruits = List.of(
                new Fruit("Apple", 0.5),
                new Fruit("Orange", 0.3),
                new Fruit("Lemon", 0.35),
                new Fruit("Watermelon", 5.2),
                new Fruit("Melon", 4.1),
                new Fruit("Ananas", 3.5),
                new Fruit("Kiwi", 1.2),
                new Fruit("Mango", 3.1),
                new Fruit("Avocado", 2.2)
        );

        List<Fruit> resultList = List.of(
                new Fruit("Orange", 0.3),
                new Fruit("Lemon", 0.35),
                new Fruit("Apple", 0.5),
                new Fruit("Kiwi", 1.2),
                new Fruit("Avocado", 2.2)
        );

        //when
        List<Fruit> actual = Main.filterFruitsByPrice(fruits, 2.2);

        //then
        assertEquals(resultList, actual, "The list should contain only fruits that does not exceed the target price, and they need to be ordered by price");
    }
}
