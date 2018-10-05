package com.psv.epam.lesson2practice.task2;

public class Model {
    private int intValue;

    public int getIntValue() {
        return intValue;
    }

    private void setIntValue(int intValue) {
        this.intValue = intValue;
    }

    public boolean checkNumberInRange(int intValue) {
        boolean numberInRange = false;
        if (intValue <= 100_000 && intValue >= 1) {
            setIntValue(intValue);
            numberInRange = true;
        }
        return numberInRange;
    }

    public StringBuilder findPerfectNumbers() {

        int sum = 0, count = 0;
        StringBuilder strNum = new StringBuilder(intValue + " are: ");
        for (int i = 1; i <= intValue; i++) {
            for (int j = 1; j <= i / 2; j++) {
                if (i % j == 0) sum += j;
            }
            if (sum == i) {
                strNum.append(i + "; ");
                count++;
            }
            sum = 0;
        }
        if (count == 0) strNum.append("0 numbers");
        return strNum;
    }

}
