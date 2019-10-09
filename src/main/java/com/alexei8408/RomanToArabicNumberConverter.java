package com.alexei8408;

import java.util.ArrayList;

class RomanToArabicNumberConverter {
    int convert(String romeValue) {
        int arabicNumber = 0;
        int subtractionRuleNumber = 0;

        ArrayList<String> romeList = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            romeList.add(i, "");
        }
        romeList.set(1, "I");
        romeList.set(5, "V");
        romeList.set(10, "X");

        for (int marker = romeValue.length(); marker > 0; marker--) {
            String romanSymbol = romeValue.substring(marker - 1, marker);
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
