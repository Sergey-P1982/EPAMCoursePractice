package com.psv.epam.lesson2practice.task1;

import java.util.Scanner;

public class InputScan {
    private static Scanner scan = new Scanner(System.in);

    public static long inputIntWithScanner(View view) {
        view.printMessage(View.INPUT_INT_NUMBER);
        while (!scan.hasNextLong()) {
            view.printMessage(View.WRONG_INPUT + View.INPUT_INT_NUMBER);
            scan.next();
        }
        return scan.nextLong();
    }
}
