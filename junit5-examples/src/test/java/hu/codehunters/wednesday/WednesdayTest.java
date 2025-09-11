package hu.codehunters.wednesday;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class WednesdayTest {

    private Wednesday underTest;

    @BeforeEach
    void init() {
        //Given
        underTest = new Wednesday();
        System.out.println(underTest.toString());
    }

    @AfterEach
    void cleanup() {

    }

    @BeforeAll
    static void setUpBeforeClass() {
        //running before any tests executed
    }

    @AfterAll
    static void tearDownAfterClass() {
        //running after all tests executed
    }



    @Test
    //@Disabled
    void testDarkMood_IgnoresThing() {
        System.out.println("testDarkMood_IgnoresThing");

        //Given
        underTest.setMood("dark");

        //When
        String result = underTest.interactWithThing();

        //Then
        assertEquals("Wednesday ignores Thing.", result);
    }

    @Test
    @DisplayName("Testing neutral mode on Wednesday")
    void testNeutralMood_NodsAtThing() {
        System.out.println("testNeutralMood_NodsAtThing");

        //Given
        underTest.setMood("meh");

        //When
        String result = underTest.interactWithThing();

        //Then
        assertEquals("Wednesday nods silently at Thing.", result);
    }
}