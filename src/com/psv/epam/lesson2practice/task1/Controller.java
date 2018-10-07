package com.psv.epam.lesson2practice.task1;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void convertIntValue() {
        while (!model.checkLongInRange(InputScan.inputIntWithScanner(view)))
            view.printMessage(view.OUT_OF_RANGE);

        view.printResult(view.OUT_VALUE_DIF_SYS, model.getLongValue(), model.convertToBinOctHex());

    }
}
