package com.korena.testable.calculator;

import com.korena.testable.calculator.components.Opspad;
import org.junit.Test;

public class OpspadTest {

    Opspad opspad = new Opspad();

    @Test
    public void showOps() {
        opspad.showOpsPad();
    }

}
