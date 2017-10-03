package com.korena.testable.calculator;

import com.korena.testable.calculator.components.LCD;
import com.korena.testable.calculator.components.Numpad;
import com.korena.testable.calculator.components.Opspad;

public class SimpleCalc implements Calculator {

    public final LCD display = new LCD();
    public final Numpad numpad = new Numpad();
    public final Opspad opspad = new Opspad();

    @Override
    public int add(int dig1, int dig2) {
        return dig1 + dig2;
    }

    @Override
    public int mult(int dig1, int dig2) {
        return dig1 * dig2;
    }

    @Override
    public int sub(int dig1, int dig2) {
        return dig1 - dig2;
    }

    @Override
    public int div(int dig1, int dig2) {
        return dig1 / dig2;
    }

    public int operate(char opn, int firstNum, int secondNum) {
        switch (opn) {
            case '+':
                return add(firstNum, secondNum);
            case '-':
                return sub(firstNum, secondNum);
            case '/':
                return div(firstNum, secondNum);
            case 'x':
                return mult(firstNum, secondNum);
        }
        return 0;
    }

}
