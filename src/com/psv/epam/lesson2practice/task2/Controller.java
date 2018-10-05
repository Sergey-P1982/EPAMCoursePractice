package com.psv.epam.lesson2practice.task2;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void checkPerfectNumbers() {
        while (!model.checkNumberInRange(InputScan.inputIntWithScanner(view)))
            view.printMessage(view.OUT_OF_RANGE);
        view.printResult(view.OUTPUT, model.findPerfectNumbers());

    }
}
