package hu.codehunters.wednesday;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class WednesdayTest {

    private Wednesday wednesday;

    @BeforeEach
    void setup() {
        //Given
        wednesday = new Wednesday();
    }

    @Test
    @Disabled
    void testDarkMood_IgnoresThing() {
        //Given
        wednesday.setMood("dark");

        //When
        String result = wednesday.interactWithThing();

        //Then
        assertEquals("Wednesday ignores Thing.", result);
    }

    @Test
    @DisplayName("Testing neutral mode on Wednesday")
    void testNeutralMood_NodsAtThing() {
        //Given
        wednesday.setMood("meh");

        //When
        String result = wednesday.interactWithThing();

        //Then
        assertEquals("Wednesday nods silently at Thing.", result);
    }
}