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
        String name = "Name";
        long number = 9999999999L;
        PhoneBook.add(name, number);
        String findName = PhoneBook.findByNumber(number);
        assertEquals(name, findName);
    }
}
