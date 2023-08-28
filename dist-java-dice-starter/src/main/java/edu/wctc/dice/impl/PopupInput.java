package edu.wctc.dice.impl;

import edu.wctc.dice.Dice.GameInput;
import org.springframework.stereotype.Component;

import javax.swing.*;

public class PopupInput implements GameInput {


    @Override
    public String getInput(String prompt)
    { return JOptionPane.showInputDialog(prompt); }
}

