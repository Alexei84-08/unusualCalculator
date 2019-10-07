package com.alexei8408;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanToArabicNumberConverterTest {
    private RomanToArabicNumberConverter romanToArabicNumberConverter = new RomanToArabicNumberConverter();

    private int convertToArabic(String romeValue) {
        return romanToArabicNumberConverter.convert(romeValue);
    }

    @Test
    void convert_I_To_1_IgnoredCase() {
        int arabicNumber = convertToArabic("i");
        assertEquals(1, arabicNumber);
    }

    @Test
    void convert_I_To_1() {
        int arabicNumber = convertToArabic("I");
        assertEquals(1, arabicNumber);
    }

    @Test
    void convert_II_To_2() {
        int arabicNumber = convertToArabic("II");
        assertEquals(2, arabicNumber);
    }

    @Test
    void convert_III_To_3() {
        int arabicNumber = convertToArabic("III");
        assertEquals(3, arabicNumber);
    }

    @Test
    void convert_IV_To_4() {
        int arabicNumber = convertToArabic("IV");
        assertEquals(4, arabicNumber);
    }

    @Test
    void convert_V_To_5() {
        int arabicNumber = convertToArabic("V");
        assertEquals(5, arabicNumber);
    }

    @Test
    void convert_VI_To_6() {
        int arabicNumber = convertToArabic("VI");
        assertEquals(6, arabicNumber);
    }

    @Test
    void convert_VII_To_7() {
        int arabicNumber = convertToArabic("VII");
        assertEquals(7, arabicNumber);
    }

    @Test
    void convert_VIII_To_8() {
        int arabicNumber = convertToArabic("VIII");
        assertEquals(8, arabicNumber);
    }

    @Test
    void convert_IX_To_9() {
        int arabicNumber = convertToArabic("IX");
        assertEquals(9, arabicNumber);
    }

    @Test
    void convert_X_To_10() {
        int arabicNumber = convertToArabic("X");
        assertEquals(10, arabicNumber);
    }
}