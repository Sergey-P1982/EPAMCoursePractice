package com.psv.epam.lesson2practice.task1;

public class Model {
    private long longValue;

    public long getLongValue() {
        return longValue;
    }

    private void setLongValue(long longValue) {
        this.longValue = longValue;
    }

    public boolean checkNumberInRange(long longValue) {
        boolean numberInRange = false;
        if (longValue <= Long.MAX_VALUE && longValue >= 1) {
            setLongValue(longValue);
            numberInRange = true;
        }
        return numberInRange;
    }

    public void convertToBin () {
        StringBuilder strInBinSys = new StringBuilder();
        long number = longValue;
        long rezultOfDivBy2, restOfDivBy2;
                do {
            rezultOfDivBy2 = number / 2;
            if (rezultOfDivBy2 == 0) {
                strInBinSys.append(number);
            break;
            }
            restOfDivBy2 = number % 2;
            strInBinSys.append(restOfDivBy2);

            if (rezultOfDivBy2 >= 2) {
                restOfDivBy2 = rezultOfDivBy2 % 2;
                strInBinSys.append(restOfDivBy2);
                rezultOfDivBy2 = rezultOfDivBy2 / 2;
                number = rezultOfDivBy2;
            }
            if (rezultOfDivBy2 < 2)
                strInBinSys.append(rezultOfDivBy2);

        }
        while (rezultOfDivBy2 >= 2);
        System.out.println(strInBinSys.append("b0").reverse());
    }

    public void convertToOct (){
        StringBuilder strInOctSys = new StringBuilder();
        long number = longValue;
        long rezultOfDivBy8, restOfDivBy8;
        do {
            rezultOfDivBy8 = number / 8;
            if (rezultOfDivBy8 == 0) {
                strInOctSys.append(number);
                break;
            }
            restOfDivBy8 = number % 8;
            strInOctSys.append(restOfDivBy8);

            if (rezultOfDivBy8 >= 8) {
                restOfDivBy8 = rezultOfDivBy8 % 8;
                strInOctSys.append(restOfDivBy8);
                rezultOfDivBy8 = rezultOfDivBy8 / 8;
                number = rezultOfDivBy8;
            }
            if (rezultOfDivBy8 < 8)
                strInOctSys.append(rezultOfDivBy8);

        }
        while (rezultOfDivBy8 >= 8);
        System.out.println(strInOctSys.append("0").reverse());
    }
    public void convertToHex () {
        StringBuilder strInHexSys = new StringBuilder();
        long number = longValue;
        long rezultOfDivBy16, restOfDivBy16;
        do {
            if (checkValueLess16(number, strInHexSys)) break;

            rezultOfDivBy16 = number / 16;
            restOfDivBy16 = number % 16;
            checkValueLess16(restOfDivBy16, strInHexSys);

            if (rezultOfDivBy16 >= 16) {
                restOfDivBy16 = rezultOfDivBy16 % 16;
                checkValueLess16(restOfDivBy16, strInHexSys);
                rezultOfDivBy16 = rezultOfDivBy16 / 16;
                number = rezultOfDivBy16;
            }
            if (rezultOfDivBy16 < 16) checkValueLess16(rezultOfDivBy16, strInHexSys);
        }

        while (rezultOfDivBy16 >= 16);
        System.out.println(strInHexSys.append("x0").reverse());
    }

    private boolean checkValueLess16(long number, StringBuilder strInHexSys) {
        if (number < 16) {
            switch ((int) number) {
                case (10):
                    strInHexSys.append("A");
                    break;
                case (11):
                    strInHexSys.append("B");
                    break;
                case (12):
                    strInHexSys.append("C");
                    break;
                case (13):
                    strInHexSys.append("D");
                    break;
                case (14):
                    strInHexSys.append("E");
                    break;
                case (15):
                    strInHexSys.append("F");
                    break;
                default:
                    strInHexSys.append(number);
                    break;
            }
            return true;
        }
        return false;
    }
}