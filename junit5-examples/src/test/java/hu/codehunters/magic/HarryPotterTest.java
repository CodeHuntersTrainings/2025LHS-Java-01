package hu.codehunters.magic;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class HarryPotterTest {

    private final HarryPotter harry = new HarryPotter();

    @Test
    void testKnownSpell_Lumos() {
        //Given

        //When
        String result = harry.castSpell("lumos");

        //Then
        assertEquals("The wand lights up!", result);
    }

    @Test
    void testKnownSpell_ExpectoPatronum() {
        //Given

        //When
        String result = harry.castSpell("expecto patronum");

        //Then
        assertEquals("A silver stag emerges!", result);
    }

    @Test
    void testUnknownSpell() {
        //Given

        //When
        String result = harry.castSpell("avada kedavra");

        //Then
        assertEquals("Unknown spell!", result);
    }

    @Test
    void testEmptySpell() {
        //Given

        //When
        String result = harry.castSpell(" ");

        //Then
        assertEquals("No spell cast!", result);
    }
}