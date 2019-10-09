package com.alexei8408;

public class Main {
    public static void main(String[] args) {
        DataInputOutput inputOutput = new DataInputOutputConsole();
        DataVerification verification = new DataVerificationArabicRomanNumber();
        ConverterNumber converterNumber = new RomanArabicNumberConverter();
        Calc calc = new CalcImpl();
        Calculator calculator = new Calculator(inputOutput, verification, converterNumber, calc);
        calculator.start();
    }
}
