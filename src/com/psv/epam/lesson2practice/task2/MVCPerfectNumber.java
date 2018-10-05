package com.psv.epam.lesson2practice.task2;

public class MVCPerfectNumber {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);

        controller.checkPerfectNumbers();
    }
}

//OUTPUT:
//        Enter any positive integer in the range of 1 to 100_000: !
//        Wrong input. Please try again. Enter any positive integer in the range of 1 to 100_000: 0
//        Integer is out of range (1 .. 100_000). Enter any positive integer in the range of 1 to 100_000: 1000_000
//        Integer is out of range (1 .. 100_000). Enter any positive integer in the range of 1 to 100_000: 10_000
//        Perfect numbers in the range of 1 to 10000 are: 6; 28; 496; 8128;