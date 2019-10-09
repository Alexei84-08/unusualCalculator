package com.alexei8408;

import java.util.Scanner;

class DataInput {
    private Scanner scanner = new Scanner(System.in);
    private DataVerification dataVerification;

    DataInput(DataVerification dataVerification) {
        this.dataVerification = dataVerification;
    }

    private String dataInput(String query) {
        System.out.println(query);
        return scanner.nextLine();
    }

    String validateInput() {
        boolean valid = false;
        String result = "";
        while (!valid) {
            result = dataInput("Введите математическое выражение: ");
            if (dataVerification.isRomanNumber(result)) {
                valid = true;
            } else if (dataVerification.isArabicNumber(result)) {
                valid = true;
            } else
                System.out.println("Не корректное значение КПП!");
        }
        return result;
    }
}
