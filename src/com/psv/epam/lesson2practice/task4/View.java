package com.psv.epam.lesson2practice.task4;


public class View {
    public static final String INPUT_INT_NUMBER = "Enter any positive integer in the range of 0 to 20: ";
    public static final String WRONG_INPUT = "Wrong input. Please try again. ";
    public static final String OUT_OF_RANGE = "Integer is out of range (0 .. 20). ";
    public static final String OUTPUT_MATRIX_ORIGINAL = "An original square matrix with size - ";
    public static final String OUTPUT_MATRIX_ROTATED = "The matrix after turning 90 degrees counterclockwise: ";


    public void printMessage(String s) {
        System.out.print(s);
    }
    public void printResult(String originalMatrixText, String rotatedMatrixText, int matrixSize,  int[][][] bothMatrices) {
        int [][] matrix = bothMatrices[0];
        int [][] rotatedMatrix = bothMatrices[1];

        System.out.println(originalMatrixText + matrixSize + " : ");
        for (int[] anMatrix : matrix) {
            for (int anAnMatrix : anMatrix) {
                System.out.print(anAnMatrix + " ");
            }
            System.out.println();
        }
        System.out.println(rotatedMatrixText);
        for (int[] anMatrixClone : rotatedMatrix) {
            for (int anAnMatrixClone : anMatrixClone) {
                System.out.print(anAnMatrixClone + " ");
            }
            System.out.println();

        }
    }
}

