package com.psv.epam.lesson2practice.task3;

import java.util.Scanner;

public class InputScan {
    private static Scanner scan = new Scanner(System.in);

    public static int inputIntWithScanner(View view) {
        view.printMessage(view.INPUT_INT_NUMBER);
        while (!scan.hasNextInt()) {
            view.printMessage(view.WRONG_INPUT + view.INPUT_INT_NUMBER);
            scan.next();
        }
        return scan.nextInt();
    }
}
