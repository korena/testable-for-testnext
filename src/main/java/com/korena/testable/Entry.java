package com.korena.testable;

import com.korena.testable.calculator.CalcFactory;
import com.korena.testable.calculator.SimpleCalc;

public class Entry {

    public static void main(String[] args) {
        CalcFactory calcFactory = new CalcFactory();
        SimpleCalc simpleCalc = (SimpleCalc) calcFactory.getCalc("simple");
        int firstNum = simpleCalc.numpad.userInputCapture();
        char opn = simpleCalc.opspad.userInputOpsCapture();
        int secondNum = simpleCalc.numpad.userInputCapture();
        int res = simpleCalc.operate(opn, firstNum, secondNum);

        simpleCalc.display.display("result = " + res);
    }

    static String help() {
        return "help message";
    }
}
