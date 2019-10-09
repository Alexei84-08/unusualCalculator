package com.alexei8408;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class DataVerification {
    private RomanToArabicNumberConverter romanToArabicNumberConverter = new RomanToArabicNumberConverter();
    private String regexpArabicNum = "^[ ]*([1-9]|10)[ ]*([+-\\\\*/])[ ]*([1-9]|10)[ ]*$";
    private String regexpRomeNum = "^[ ]*(V?I{2}|V?I{3}|IV|V|IX|X)[ ]*([+-\\\\*/])[ ]*(V?I{2}|V?I{3}|IV|V|IX|X)[ ]*$";
    private Pattern pattern;
    private Matcher matcher;
    private Matcher matcher2;

    Boolean isRomanNumber(String valueStr){
        pattern = Pattern.compile(regexpRomeNum);
        matcher = pattern.matcher(valueStr);
        return matcher.find();
    }
    Boolean isArabicNumber(String valueStr){
        pattern = Pattern.compile(regexpArabicNum);
        matcher = pattern.matcher(valueStr);
        return matcher.find();
    }

    Matcher verification(String valueStr) {
        pattern = Pattern.compile(regexpRomeNum);
        matcher = pattern.matcher(valueStr);
        if (matcher.find()) {
            pattern = Pattern.compile(regexpArabicNum);
            matcher2 = pattern.matcher(str(matcher.group(1)) + matcher.group(2) + str(matcher.group(3)));
            return matcher2.find() ? matcher2 : null;
        } else {
            pattern = Pattern.compile(regexpArabicNum);
            matcher = pattern.matcher(valueStr);
            return matcher.find() ? matcher : null;
        }
    }

    private String str(String romeValue) {
        return String.valueOf(romanToArabicNumberConverter.convert(romeValue));
    }
}
