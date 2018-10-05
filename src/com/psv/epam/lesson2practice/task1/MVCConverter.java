package com.psv.epam.lesson2practice.task1;

public class MVCConverter {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);

        controller.convertIntValue();

    }
}

//OUTPUT:
//        Enter any positive integer in the range of 1 to 9223372036854775807: 0
//        Integer is out of range (1 .. 9223372036854775807). Enter any positive integer in the range of 1 to 9223372036854775807: ()
//        Wrong input. Please try againEnter any positive integer in the range of 1 to 9223372036854775807: -1000
//        Integer is out of range (1 .. 9223372036854775807). Enter any positive integer in the range of 1 to 9223372036854775807: 255
//        255 in the BIN system = 0b11111111
//        255 in the OCT system = 0377
//        255 in the HEX system = 0xFF