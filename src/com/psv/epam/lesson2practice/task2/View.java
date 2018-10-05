package com.psv.epam.lesson2practice.task2;

public class View {
    public static final String INPUT_INT_NUMBER = "Enter any positive integer in the range of 1 to 100_000: ";
    public static final String WRONG_INPUT = "Wrong input. Please try again. ";
    public static final String OUT_OF_RANGE = "Integer is out of range (1 .. 100_000). ";
    public static final String OUTPUT = "Perfect numbers in the range of 1 to ";


    public void printMessage(String s) {
        System.out.print(s);
    }
    public void printResult(String s, StringBuilder perfectNum) {
        System.out.println(s + perfectNum);
    }
}
