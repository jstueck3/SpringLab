package edu.wctc.dice.impl;

import edu.wctc.dice.Dice.GameOutput;

import javax.swing.*;

public class GUIoutput implements GameOutput {
    @Override
    public void output(String text) {

        JOptionPane.showMessageDialog(null,text);


    }
}
