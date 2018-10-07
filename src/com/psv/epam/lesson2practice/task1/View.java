package com.psv.epam.lesson2practice.task1;

public class View {
    public static final String INPUT_INT_NUMBER= "Enter any positive integer in the range of 1 to 9223372036854775807: ";
    public static final String WRONG_INPUT= "Wrong input. Please try again";
    public static final String OUT_OF_RANGE = "Integer is out of range. ";
    public static final String OUT_VALUE_DIF_SYS= " in BIN|OCT|HEX systems = ";

    public void printMessage(String s) {
        System.out.print(s);
    }
    public void printResult(String s, long value, StringBuilder strLongInBinOctHex) {
        System.out.print(value + s + strLongInBinOctHex);
    }
}
