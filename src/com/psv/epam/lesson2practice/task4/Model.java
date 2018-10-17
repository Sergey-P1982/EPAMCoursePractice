package com.psv.epam.lesson2practice.task4;

import java.util.Random;

public class Model {
    private int matrixSize;

    public int getMatrixSize() {
        return matrixSize;
    }

    private void setMatrixSize(int matrixSize) {
        this.matrixSize = matrixSize;
    }

    public boolean checkSizeInRange(int matrixSize) {
        boolean numberInRange = false;
        if (matrixSize <= 20 && matrixSize >= 0) {
            setMatrixSize(matrixSize);
            numberInRange = true;
        }
        return numberInRange;
    }

    public int[][] writeRandomMatrix() {
        Random random = new Random();
        int[][] matrix = new int[matrixSize][matrixSize];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(100)-50;
            }
        }
        return matrix;
    }

    public int[][][] getBothMatrices() {

        int[][] matrix = writeRandomMatrix();
        int[][] rotatedMatrix;
        int[][][] bothMatrices;

        rotatedMatrix = new int[matrix.length][matrix.length];

        int rotateNumber;
        int colomnNumber = matrix.length - 1;
        for (int i = 0; i < matrix.length; i++) {
            int rowNumber = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                rotateNumber = matrix[rowNumber][colomnNumber];
                rotatedMatrix[i][j] = rotateNumber;
                rowNumber++;
            }
            colomnNumber--;

        }
        bothMatrices = new int[][][]{matrix, rotatedMatrix};
        return bothMatrices;
    }

}