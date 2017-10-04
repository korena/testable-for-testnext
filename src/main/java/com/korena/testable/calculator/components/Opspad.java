package com.korena.testable.calculator.components;

import java.util.Scanner;

public class Opspad {

    public char userInputOpsCapture( boolean skip) {
        showOpsPad();
        return getUserChoice(skip);
    }

    public void showOpsPad() {
        System.out.println("|---|---|---|---|");
        System.out.println("| + | - | x | / |");
        System.out.println("|---|---|---|---|");
    }
    public char getUserChoice(boolean skip){
        Scanner read = new Scanner(System.in);
        return !skip?read.next().charAt(0):'+';
    }


}
