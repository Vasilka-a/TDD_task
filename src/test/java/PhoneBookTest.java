import org.example.PhoneBook;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

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
}
