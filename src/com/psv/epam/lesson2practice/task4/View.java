package com.psv.epam.lesson2practice.task4;


public class View {
    public static final String INPUT_INT_NUMBER = "Enter any positive integer in the range of 0 to 20: ";
    public static final String WRONG_INPUT = "Wrong input. Please try again. ";
    public static final String OUT_OF_RANGE = "Integer is out of range (0 .. 20). ";
    public static final String OUTPUT_MATRIX_ORIGINAL = "An original square matrix ";
    public static final String OUTPUT_MATRIX_ROTATED = "and the matrix after turning 90 degrees counterclockwise with size - ";


    public void printMessage(String s) {
        System.out.print(s);
    }

    public void printResult(String originalMatrixText, String rotatedMatrixText, int matrixSize, int[][][] bothMatrices) {

        System.out.println(originalMatrixText + rotatedMatrixText + matrixSize + " : ");

        for (int[][] matrices : bothMatrices) {
            for (int[] anMatrix : matrices) {
                for (int anAnMatrix : anMatrix) {
                    System.out.print(anAnMatrix + " ");
                }
                System.out.println();
            }
            System.out.println("______________________________ ");
        }
    }
}


