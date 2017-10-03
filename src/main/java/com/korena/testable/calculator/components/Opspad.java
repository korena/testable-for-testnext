package com.korena.testable.calculator.components;

import java.util.Scanner;

public class Opspad {

    public char showOpsPad() {
        System.out.println("|---|---|---|---|");
        System.out.println("| + | - | x | / |");
        System.out.println("|---|---|---|---|");

        Scanner read = new Scanner(System.in);
        return read.next().charAt(0);
    }


}
