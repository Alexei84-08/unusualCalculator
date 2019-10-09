package com.alexei8408;

import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;

import static org.junit.jupiter.api.Assertions.*;

class DataVerificationArabicRomanNumberTest {
    private DataVerificationArabicRomanNumber verificationNumber = new DataVerificationArabicRomanNumber();
    private Matcher matcher;
    private String romanNumber = "  X  /  II ";
    private String arabicNumber = "  5  *  3 ";

    @Test
    void isRomanNumber_0() {
        assertTrue(verificationNumber.isRomanNumber(romanNumber));
    }

    @Test
    void isRomanNumberFalse() {
        assertFalse(verificationNumber.isRomanNumber(""));
    }

    @Test
    void isRomanNumberFalse_XX() {
        assertFalse(verificationNumber.isRomanNumber("XX"));
    }

    @Test
    void isRomanNumberFalse_XI() {
        assertFalse(verificationNumber.isRomanNumber("XI"));
    }

    @Test
    void isRomanNumberFalse_IIII() {
        assertFalse(verificationNumber.isRomanNumber("IIII"));
    }

    @Test
    void isRomanNumberFalse_IIV() {
        assertFalse(verificationNumber.isRomanNumber("IIV"));
    }

    @Test
    void isRomanNumberFalse_VIIII() {
        assertFalse(verificationNumber.isRomanNumber("VIIII"));
    }

    @Test
    void isArabicNumber() {
        assertTrue(verificationNumber.isArabicNumber(arabicNumber));
    }

    @Test
    void isArabicNumberFalse_0() {
        assertFalse(verificationNumber.isArabicNumber("0"));
    }

    @Test
    void isArabicNumberFalse_11() {
        assertFalse(verificationNumber.isArabicNumber("11"));
    }

    @Test
    void getMatcherArabicNumber() {
        matcher = verificationNumber.getMatcherArabicNumber(arabicNumber);
        assertEquals("5", matcher.group(1));
        assertEquals("*", matcher.group(2));
        assertEquals("3", matcher.group(3));
    }

    @Test
    void getMatcherRomanNumber() {
        matcher = verificationNumber.getMatcherRomanNumber(romanNumber);
        assertEquals("X", matcher.group(1));
        assertEquals("/", matcher.group(2));
        assertEquals("II", matcher.group(3));
    }
}