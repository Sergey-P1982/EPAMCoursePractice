package com.psv.epam.lesson2practice.task4;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void getRotatedMatrix() {
        while (!model.checkSizeInRange(InputScan.inputIntWithScanner(view)))
            view.printMessage(view.OUT_OF_RANGE);

        model.writeRandomMatrix();
        view.printResult(view.OUTPUT_MATRIX_ORIGINAL, view.OUTPUT_MATRIX_ROTATED, model.getMatrixSize(), model.getBothMatrices());

    }
}