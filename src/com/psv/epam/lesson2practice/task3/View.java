package com.psv.epam.lesson2practice.task3;

public class View {
    public static final String INPUT_INT_NUMBER = "Enter the height of the pyramid, any integer from 1 to 9: ";
    public static final String WRONG_INPUT = "Wrong input. Please try again. ";
    public static final String OUT_OF_RANGE = "Integer is out of range (1 .. 9). ";
    public static final String OUTPUT = "Your pyramid with a height of ";


    public void printMessage(String s) {
        System.out.print(s);
    }
    public void printResult(String s, int height) {
        System.out.println(s + height + " looks like this: ");
    }

}
