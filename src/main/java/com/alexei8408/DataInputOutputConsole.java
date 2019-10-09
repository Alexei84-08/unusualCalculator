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
}
