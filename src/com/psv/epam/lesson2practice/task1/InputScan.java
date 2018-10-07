package com.psv.epam.lesson2practice.task1;

import java.util.Scanner;

public class InputScan {
    private static Scanner scan = new Scanner(System.in);

    public static long inputIntWithScanner(View view) {
        view.printMessage(view.INPUT_INT_NUMBER);
        while (!scan.hasNextLong()) {
            view.printMessage(view.WRONG_INPUT + view.INPUT_INT_NUMBER);
            scan.next();
        }
        return scan.nextLong();
    }
}
