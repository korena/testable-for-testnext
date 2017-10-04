package com.korena.testable.calculator.components;

import java.util.Scanner;

public class Numpad {

    public String showNumPad() {
        System.out.println("|---|---|---|");
        System.out.println("|-"+ Button.ONE.get() +"-|-"+Button.TWO.get() + "-|-"+ Button.THREE.get() +"-|");
        System.out.println("|---|---|---|");
        System.out.println("|-"+ Button.FOUR.get() + "-|-" + Button.FIVE.get() + "-|-" + Button.SIX.get() + "-|");
        System.out.println("|---|---|---|");
        System.out.println("|-"+ Button.SEVEN.get() +"-|-" + Button.EIGHT.get() + "-|-" + Button.NINE.get() + "-|");
        System.out.println("|---|---|---|");
        System.out.println("|---|-" + Button.ZERO.get() + "-|---|");
        System.out.println("|---|---|---|");
        return "random";
    }

    public int getNumber(boolean skip){
        Scanner read = new Scanner(System.in);
        return !skip?read.nextInt():5;
    }

    public int userInputCapture(boolean skip){
        showNumPad();
        return getNumber(skip);
    }
}
