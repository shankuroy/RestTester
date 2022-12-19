package com.flop.resttester.components;

import javax.swing.*;
import javax.swing.plaf.ComboBoxUI;
import javax.swing.plaf.basic.BasicComboBoxUI;

public class CustomArrowUI extends BasicComboBoxUI {

    public static ComboBoxUI createUI(JComponent c) {
        return new CustomArrowUI();
    }

    @Override
    protected JButton createArrowButton() {
        JButton button = super.createArrowButton();
        button.setOpaque(false);
        return button;
    }
}