package com.korena.testable.calculator.components;

import java.util.Scanner;

public class Opspad {

    public char userInputOpsCapture() {
        showOpsPad();
        return getUserChoice();
    }

    public void showOpsPad() {
        System.out.println("|---|---|---|---|");
        System.out.println("| + | - | x | / |");
        System.out.println("|---|---|---|---|");
    }
    public char getUserChoice(){
        Scanner read = new Scanner(System.in);
        return read.next().charAt(0);
    }


}
