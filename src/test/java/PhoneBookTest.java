import org.example.PhoneBook;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneBookTest {

    @RepeatedTest(2)
    public void testAdd () {
        String name = "Name";
        long number = 9999999999L;
        int expectedSize = 1;
        int actualSize = PhoneBook.add(name, number);
        assertEquals(expectedSize, actualSize);
    }

    @Test
    public void testFindByNumber() {
        String expectedName = "Name";
        long number = 9999999999L;
        PhoneBook.add(expectedName, number);
        String actualName = PhoneBook.findByNumber(number);
        assertEquals(expectedName, actualName);
    }

    @Test
    public void testFindByName() {
        String name = "Name";
        long expectedNumber = 9999999999L;
        PhoneBook.add(name, expectedNumber);
        long actualNumber = PhoneBook.findByName(name);
        assertEquals(expectedNumber, actualNumber);
    }

    @Test
    public void testPrintAllNames() {
        String name = "Anna";
        String name2 = "Bob";
        long number = 9999999999L;
        long number2 = 8888888888L;

        PhoneBook.add(name2, number2);
        PhoneBook.add(name,number);

        List<String> expectedAllNames = new ArrayList<>();
        expectedAllNames.add(name);
        expectedAllNames.add(name2);
        Collections.sort(expectedAllNames);

        List <String> actualAllNames = PhoneBook.printAllNames();
        assertEquals(expectedAllNames, actualAllNames);
    }
}
