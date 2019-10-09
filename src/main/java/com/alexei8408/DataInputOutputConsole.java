package com.alexei8408;

import java.util.Scanner;

class DataInputOutputConsole implements DataInputOutput {
    private Scanner scanner = new Scanner(System.in);

    private String dataInput(String query) {
        System.out.println(query);
        return scanner.nextLine();
    }

    @Override
    public String input() {
        return dataInput("Введите математическое выражение: ");
    }

    @Override
    public void output(String out) {
        System.out.println("Результат вычесления: " + out);
    }

//    Matcher Input() {
//        boolean valid = false;
//        String result = "";
//        while (true) {
//            result = dataInput("Введите математическое выражение: ");
//            if (dataVerification.isRomanNumber(result)) {
//                valid = true;
//                return dataVerification.getMatcherRomanNumber(result);
//            } else if (dataVerification.isArabicNumber(result)) {
//                valid = true;
//                return dataVerification.getMatcherArabicNumber(result);
//            } else
////                System.out.println("Не корректное значение!");
//            throw new NumberFormatException("Неверно введены данные!!!");
//        }
//    }
}
