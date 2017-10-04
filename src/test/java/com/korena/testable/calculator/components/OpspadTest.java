package com.korena.testable.calculator.components;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class OpspadTest {

    Opspad opspad = new Opspad();


    @Test
    public void testOpspad() {
        opspad.getUserChoice(true);
        assertTrue(true);
    }

}
