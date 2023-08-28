package edu.wctc.dice.impl;

import edu.wctc.dice.Dice.GameOutput;

public class ConsoleOutput implements GameOutput {
    public void output(String text) {
        System.out.println(text);

    }
}
