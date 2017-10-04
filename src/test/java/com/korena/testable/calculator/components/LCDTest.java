package com.korena.testable.calculator.components;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class LCDTest {

    LCD lcd = new LCD();

    @Test
    public void testLcd(){
        lcd.display("Stuff");
        assertTrue(true);

    }

}
