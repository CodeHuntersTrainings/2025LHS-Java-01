package hu.codehunters.magic;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class HarryPotterTest {

    private HarryPotter underTest = new HarryPotter();

    //@Test
    //void testKnownSpell_Lumos() {
    //    //Given
//
    //    //When
    //    String result = harry.castSpell("lumos");
//
    //    //Then
    //    assertEquals("The wand lights up!", result);
    //}

    @Test
    @DisplayName("Lumos is causing a lighting wand.")
    void castSpell_shouldReturnLightingWand_whenLumosSpellCast() {
        //Given
        String input = "Lumos";

        //When
        String result = underTest.castSpell(input);

        //Then
        Assertions.assertEquals("The wand lights up!", result);
    }

    @Test
    @DisplayName("Exception is tested in the default branch")
    void castSpell_shouldThrowException_whenSpellUnknown() {
        //Given
        String input = "lafhod";

        //When - Then
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> underTest.castSpell(input));
    }

    @Test
    void testKnownSpell_ExpectoPatronum() {
        //Given

        //When
        String result = underTest.castSpell("expecto patronum");

        //Then
        assertEquals("A silver stag emerges!", result);
    }

    @Test
    @Disabled
    void testUnknownSpell() {
        //Given

        //When
        String result = underTest.castSpell("avada kedavra");

        //Then
        assertEquals("Unknown spell!", result);
    }

    @Test
    void testEmptySpell() {
        //Given

        //When
        String result = underTest.castSpell(" ");

        //Then
        assertEquals("No spell cast!", result);
    }
}