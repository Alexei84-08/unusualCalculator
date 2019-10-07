package com.alexei8408;

public class Main {
    public static void main(String[] args) {
        DataVerification dataVerification = new DataVerification();
//        dataVerification.Verification("  2  +   5  ");
        String s = "  II   +    VIII  ";
//        dataVerification.Verification("V  +   I  ");

        RomanToArabicNumberConverter romanToArabicNumberConverter = new RomanToArabicNumberConverter();
//        int a = romanToArabicNumberConverter.convert(dataVerification.verification(s).group(1));
//        int b = romanToArabicNumberConverter.convert(dataVerification.verification(s).group(3));
        int a1 = Integer.parseInt(dataVerification.verification(s).group(1));
        int b1 = Integer.parseInt(dataVerification.verification(s).group(3));
        char c = dataVerification.verification(s).group(2).charAt(0);
        Calculator calculator = new Calculator();
//        System.out.println(a);
//        System.out.println(b);
        System.out.println(a1);
        System.out.println(b1);
//        System.out.println(calculator.calc(a, b, c).toString());
        System.out.println(calculator.calc(a1, b1, c).toString());
    }
}
