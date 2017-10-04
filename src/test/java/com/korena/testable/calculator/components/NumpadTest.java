package com.korena.testable.calculator.components;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class NumpadTest {

    Numpad numpad = new Numpad();


    @Test
    public void numPadTest(){

        numpad.showNumPad();
        assertTrue(true);
    }

    @Test
    public void numPadTest2() {
        numpad.userInputCapture(true);
        assertTrue(true);
    }

}
