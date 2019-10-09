package com.alexei8408;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanArabicNumberConverterTest {
    private RomanArabicNumberConverter romanArabicNumberConverter = new RomanArabicNumberConverter();

    private int convert(String romeValue) {
        return romanArabicNumberConverter.convert(romeValue);
    }

    private String reverseConvert(int arabicValue) {
        return romanArabicNumberConverter.reverseConvert(arabicValue);
    }

    @Test
    void convert_I_To_1() {
        int arabicNumber = convert("I");
        assertEquals(1, arabicNumber);
    }

    @Test
    void convert_II_To_2() {
        int arabicNumber = convert("II");
        assertEquals(2, arabicNumber);
    }

    @Test
    void convert_III_To_3() {
        int arabicNumber = convert("III");
        assertEquals(3, arabicNumber);
    }

    @Test
    void convert_IV_To_4() {
        int arabicNumber = convert("IV");
        assertEquals(4, arabicNumber);
    }

    @Test
    void convert_V_To_5() {
        int arabicNumber = convert("V");
        assertEquals(5, arabicNumber);
    }

    @Test
    void convert_VI_To_6() {
        int arabicNumber = convert("VI");
        assertEquals(6, arabicNumber);
    }

    @Test
    void convert_VII_To_7() {
        int arabicNumber = convert("VII");
        assertEquals(7, arabicNumber);
    }

    @Test
    void convert_VIII_To_8() {
        int arabicNumber = convert("VIII");
        assertEquals(8, arabicNumber);
    }

    @Test
    void convert_IX_To_9() {
        int arabicNumber = convert("IX");
        assertEquals(9, arabicNumber);
    }

    @Test
    void convert_X_To_10() {
        int arabicNumber = convert("X");
        assertEquals(10, arabicNumber);
    }

    @Test
    void reverseConvert_1() {
        assertEquals("I", reverseConvert(1));
    }

    @Test
    void reverseConvert_2() {
        assertEquals("II", reverseConvert(2));
    }

    @Test
    void reverseConvert_3() {
        assertEquals("III", reverseConvert(3));
    }

    @Test
    void reverseConvert_4() {
        assertEquals("IV", reverseConvert(4));
    }

    @Test
    void reverseConvert_5() {
        assertEquals("V", reverseConvert(5));
    }

    @Test
    void reverseConvert_6() {
        assertEquals("VI", reverseConvert(6));
    }

    @Test
    void reverseConvert_7() {
        assertEquals("VII", reverseConvert(7));
    }

    @Test
    void reverseConvert_8() {
        assertEquals("VIII", reverseConvert(8));
    }

    @Test
    void reverseConvert_9() {
        assertEquals("IX", reverseConvert(9));
    }

    @Test
    void reverseConvert_10() {
        assertEquals("X", reverseConvert(10));
    }

    @Test
    void reverseConvert_11() {
        assertEquals("XI", reverseConvert(11));
    }

    @Test
    void reverseConvert_50() {
        assertEquals("L", reverseConvert(50));
    }

    @Test
    void reverseConvert_100() {
        assertEquals("C", reverseConvert(100));
    }

    @Test
    void reverseConvert_84() {
        assertEquals("LXXXIV", reverseConvert(84));
    }
}