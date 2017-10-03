package com.korena.testable.calculator.components;

public enum Button {
    ZERO(0),
    ONE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9);

    private int numVal;

    Button(int numVal) {
        this.numVal = numVal;
    }

    public int get() {
        return numVal;
    }

}
