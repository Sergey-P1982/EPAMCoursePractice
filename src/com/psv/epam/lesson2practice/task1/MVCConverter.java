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
//        Enter any positive integer in the range of 1 to 9223372036854775807L: 9223372036854775807
//        9223372036854775807 in BIN|OCT|HEX systems = 0b111111111111111111111111111111111111111111111111111111111111111| 0777777777777777777777| 0x7FFFFFFFFFFFFFFF