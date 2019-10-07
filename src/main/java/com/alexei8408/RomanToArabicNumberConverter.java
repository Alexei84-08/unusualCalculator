package com.alexei8408;

import java.util.ArrayList;

class RomanToArabicNumberConverter {
    int convert(String romeValue) {
        String romeValueIgnoredCase = romeValue.toUpperCase();
        int arabicNumber = 0;
        int subtractionRuleNumber = 0;

        ArrayList<String> romeList = new ArrayList<String>();
        for (int i = 0; i <= 10; i++) {
            romeList.add(i, "");
        }
        romeList.set(1, "I");
        romeList.set(10, "X");
        romeList.set(5, "V");

        for (int marker = romeValueIgnoredCase.length(); marker > 0; marker--) {
            String romanSymbol = romeValueIgnoredCase.substring(marker - 1, marker);
            int valueRomeNumber = romeList.indexOf(romanSymbol);

            if (valueRomeNumber >= subtractionRuleNumber
            ) {
                arabicNumber += valueRomeNumber;
            } else {
                arabicNumber -= valueRomeNumber;
            }
            subtractionRuleNumber = valueRomeNumber;
        }
        return arabicNumber;
    }
}
