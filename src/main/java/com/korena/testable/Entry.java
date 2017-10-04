package com.korena.testable;

import com.korena.testable.calculator.CalcFactory;
import com.korena.testable.calculator.SimpleCalc;
import java.util.Objects;

public class Entry {

    public static void main(String[] args) {

        boolean skip = false;
        if(Objects.equals(args[0], "test")) {
            skip = true;
        }


        CalcFactory calcFactory = new CalcFactory();
        SimpleCalc simpleCalc = (SimpleCalc) calcFactory.getCalc("simple");
        int firstNum = simpleCalc.numpad.userInputCapture(skip);
        char opn = simpleCalc.opspad.userInputOpsCapture(skip);
        int secondNum = simpleCalc.numpad.userInputCapture(skip);
        int res = simpleCalc.operate(opn, firstNum, secondNum);

        simpleCalc.display.display("result = " + res);
    }

    static String help() {
        return "help message";
    }
}
