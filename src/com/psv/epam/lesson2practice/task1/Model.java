package com.psv.epam.lesson2practice.task1;

public class Model {
    private long longValue;

    public long getLongValue() {
        return longValue;
    }

    private void setLongValue(long longValue) {
        this.longValue = longValue;
    }

    public boolean checkLongInRange(long longValue) {
        boolean numberInRange = false;
        if (longValue <= Long.MAX_VALUE && longValue >= 1) {
            setLongValue(longValue);
            numberInRange = true;
        }
        return numberInRange;
    }

    public StringBuilder convertToBinOctHex() {
        StringBuilder strNumInDifSys = new StringBuilder();
        long number, rezultOfDivByN, restOfDivByN;

        for (int numSys = 16; numSys >= 0; numSys -= 8) {
            if (numSys == 0) numSys = 2;
            number = longValue;
            do {
                rezultOfDivByN = number / numSys;
                if (rezultOfDivByN == 0) {
                    checkValueLess16(number, strNumInDifSys);
                    break;
                }
                restOfDivByN = number % numSys;
                checkValueLess16(restOfDivByN, strNumInDifSys);

                if (rezultOfDivByN >= numSys) {
                    restOfDivByN = rezultOfDivByN % numSys;
                    checkValueLess16(restOfDivByN, strNumInDifSys);
                    rezultOfDivByN = rezultOfDivByN / numSys;
                    number = rezultOfDivByN;
                }
                if (rezultOfDivByN < numSys)
                    checkValueLess16(rezultOfDivByN, strNumInDifSys);

            }
            while (rezultOfDivByN >= numSys);

            if (numSys == 2) strNumInDifSys.append("b0");
            else if (numSys == 8) strNumInDifSys.append("0 |");
            else if (numSys == 16) strNumInDifSys.append("x0 |");

        }

        return strNumInDifSys.reverse();
    }

    private boolean checkValueLess16(long number, StringBuilder strNumInDifSys) {
        if (number < 16) {
            switch ((int) number) {
                case (10):
                    strNumInDifSys.append("A");
                    break;
                case (11):
                    strNumInDifSys.append("B");
                    break;
                case (12):
                    strNumInDifSys.append("C");
                    break;
                case (13):
                    strNumInDifSys.append("D");
                    break;
                case (14):
                    strNumInDifSys.append("E");
                    break;
                case (15):
                    strNumInDifSys.append("F");
                    break;
                default:
                    strNumInDifSys.append(number);
                    break;
            }
            return true;
        }
        return false;
    }

}