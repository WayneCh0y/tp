package seedu.duke.shelf;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import seedu.duke.shelving.shelves.Shelves;

import static org.junit.jupiter.api.Assertions.*;

//@@author Deanson-Choo
public class ShelvesTest {
    private Shelves shelves;

    @BeforeEach
    void setup() {
        shelves = new Shelves("R");
    }
    @Test
    public void validShelfNum_invalidSlotNum() {
        AssertionError error = assertThrows(AssertionError.class, () -> {shelves.deleteBookFromSection(1, -1);
        });
        assertEquals("Invalid bookIndex!", error.getMessage());
    }

    @Test
    public void validShelfNum_validSlotNum() {
        shelves.addBookToSection("hello", "world");
        assertDoesNotThrow(() -> shelves.deleteBookFromSection(0, 0));
    }

    @Test
    public void InvalidShelfNum_lowerEnd() {
        AssertionError error = assertThrows(AssertionError.class, () -> {shelves.deleteBookFromSection(-1, 1);
        });
        assertEquals("Invalid Shelf Number!", error.getMessage());
    }

    @Test
    public void InvalidShelfNum_higherEnd() {
        AssertionError error = assertThrows(AssertionError.class, () -> {shelves.deleteBookFromSection(5, 1);
        });
        assertEquals("Invalid Shelf Number!", error.getMessage());
    }








}
