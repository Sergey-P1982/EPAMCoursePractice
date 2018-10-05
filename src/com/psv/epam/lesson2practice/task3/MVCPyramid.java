package com.psv.epam.lesson2practice.task3;

import java.util.Scanner;

public class MVCPyramid {
    public static void main(String[] args) {
Model model = new Model();
View view = new View();
Controller controller = new Controller(model, view);

controller.createPyramid();
    }
}
//OUTPUT:
//        Enter a height of a pyramid, any integer from 1 to 9: p
//        Wrong input. Please try again. Enter a height of a pyramid, any integer from 1 to 9: 0
//        Integer is out of range (1 .. 9). Enter a height of a pyramid, any integer from 1 to 9: 11
//        Integer is out of range (1 .. 9). Enter a height of a pyramid, any integer from 1 to 9: -10
//        Integer is out of range (1 .. 9). Enter a height of a pyramid, any integer from 1 to 9: 5
//        Your pyramid with a height of 5 looks like this:
//            1
//           121
//          12321
//         1234321
//        123454321
