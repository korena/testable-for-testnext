package com.korena.testable.calculator;

public class CalcFactory {


    public Calculator getCalc(String type) {
        if ("simple".equals(type)) {
            return new SimpleCalc();
        }

        return new SimpleCalc();
    }

}
