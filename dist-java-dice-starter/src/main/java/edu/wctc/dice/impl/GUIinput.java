package edu.wctc.dice.impl;

import edu.wctc.dice.Dice.GameInput;

import javax.swing.*;

public class GUIinput implements GameInput {

    @Override
    public String getInput(String prompt) {

        return JOptionPane.showInputDialog(prompt);
    }


}
