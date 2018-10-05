package com.psv.epam.lesson2practice.task4;

public class MVCMatrix {
    public static void main(String[] args) {
       Model model = new Model();
       View view = new View();
       Controller controller = new Controller(model, view);
       controller.getRotatedMatrix();
    }
}
//OUTPUT:
//        Enter any positive integer in the range of 0 to 20: !
//        Wrong input. Please try again. Enter any positive integer in the range of 0 to 20: -1
//        Integer is out of range (0 .. 20). Enter any positive integer in the range of 0 to 20: 21
//        Integer is out of range (0 .. 20). Enter any positive integer in the range of 0 to 20: 5
//        An original square matrix with size - 5 :
//        -33 -49 21 15 -10
//        -13 26 -35 38 41
//        -34 -17 47 13 -26
//        -46 -16 -28 -25 32
//        4 -10 4 -35 38
//        The matrix after turning 90 degrees counterclockwise:
//        -10 41 -26 32 38
//        15 38 13 -25 -35
//        21 -35 47 -28 4
//        -49 26 -17 -16 -10
//        -33 -13 -34 -46 4
