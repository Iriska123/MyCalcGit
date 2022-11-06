package ru.example.mycalcgit.ui;

import ru.example.mycalcgit.model.Calculator;

public class CalculatorPresenter {

    private CalculatorView view;
    private Calculator calculator;

    public CalculatorPresenter(CalculatorView view, Calculator calculator) {
        this.view = view;
        this.calculator = calculator;
    }
    public void keyOnePressed () {

    }

    public void onDigitPressed (int digit) {

    }
}
