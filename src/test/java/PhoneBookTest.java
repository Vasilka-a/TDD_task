import org.example.PhoneBook;
import org.junit.jupiter.api.RepeatedTest;

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
}
