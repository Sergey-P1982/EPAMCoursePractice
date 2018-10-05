package com.psv.epam.lesson2practice.task1;

public class View {
    public static final String INPUT_INT_NUMBER= "Enter any positive integer in the range of 1 to 9223372036854775807: ";
    public static final String WRONG_INPUT= "Wrong input. Please try again";
    public static final String OUT_OF_RANGE = "Integer is out of range (1 .. 9223372036854775807). ";
    public static final String OUT_VALUE_HEX= " in the HEX system = ";
    public static final String OUT_VALUE_BIN= " in the BIN system = ";
    public static final String OUT_VALUE_OCT= " in the OCT system = ";

    public void printMessage(String s) {
        System.out.print(s);
    }
    public void printResult(String s, long value) {
        System.out.print(value + s);
    }
}
