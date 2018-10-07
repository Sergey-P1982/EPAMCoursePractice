package com.psv.epam.lesson2practice.task3;

public class Model {
    private int heightPyram;

    public int getHeightPyram() {
        return heightPyram;
    }

    private void setHeightPyram(int heightPyram) {
        this.heightPyram = heightPyram;
    }

    public boolean checkHeightInRange(int heightPyram) {
        boolean numberInRange = false;
        if (heightPyram <= 9 && heightPyram > 0) {
            setHeightPyram(heightPyram);
            numberInRange = true;
        }
        return numberInRange;
    }

    public void printPyramid() {
        int row, space;

        for (row = 1; row <= heightPyram; row++) {
            for (space = row; space < heightPyram; space++) {
                System.out.print(" ");
            }
            for (int i = 0; i < row; i++) {
                System.out.print(i + 1);
            }
            for (int i = row - 1; i >= 1; i--) {
                System.out.print(i);
            }
            System.out.println();
        }

    }

}
