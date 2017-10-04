package com.korena.testable.calculator;

import com.korena.testable.calculator.components.Button;
import org.junit.Test;

public class ButtonTest {


    @Test
    public void justCallItTest(){
        System.out.println("|---|---|---|");
        System.out.println("|-"+ Button.ONE.get() +"-|-"+Button.TWO.get() + "-|-"+ Button.THREE.get() +"-|");
        System.out.println("|---|---|---|");
        System.out.println("|-"+ Button.FOUR.get() + "-|-" + Button.FIVE.get() + "-|-" + Button.SIX.get() + "-|");
        System.out.println("|---|---|---|");
        System.out.println("|-"+ Button.SEVEN.get() +"-|-" + Button.EIGHT.get() + "-|-" + Button.NINE.get() + "-|");
        System.out.println("|---|---|---|");
        System.out.println("|---|-" + Button.ZERO.get() + "-|---|");
        System.out.println("|---|---|---|");
        assert(true);
    }
}
