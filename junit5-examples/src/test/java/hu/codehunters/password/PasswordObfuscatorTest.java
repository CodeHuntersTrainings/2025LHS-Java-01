package hu.codehunters.password;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class PasswordObfuscatorTest {

    @Test
    void test_obfuscatePasswordV1() {
        //Given
        PasswordObfuscator underTest = new PasswordObfuscator();

        //When
        String result = underTest.obfuscatePasswordV1("Password123!");

        //Then
        Assertions.assertNotNull(result);
        Assertions.assertEquals("P*******123!", result);
    }

    @Test
    void test_obfuscatePasswordV2() {
        //Given
        PasswordObfuscator underTest = new PasswordObfuscator();

        //When
        String result = underTest.obfuscatePasswordV2("Password123!");

        //Then
        Assertions.assertNotNull(result);
        Assertions.assertEquals("P*******!", result);
    }

    @ParameterizedTest
    @CsvSource({
            "'Password123!', 'P*******123!'",
            "'Admin2024$', 'A****dkfhkjs2024$'",
            "'helloWorld1', '*****W****1'",
            "'Test!', 'T***!'"
    })
    void test_obfuscatePasswordV2(String input, String expected) {
        System.out.println();
        // Given
        PasswordObfuscator underTest = new PasswordObfuscator();

        // When
        String result = underTest.obfuscatePasswordV2(input);

        // Then
        Assertions.assertEquals(expected, result);
    }

}