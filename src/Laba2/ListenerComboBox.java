package Laba2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ListenerComboBox implements ItemListener {
    JComponent movable;

    public ListenerComboBox(JComponent movable) {
        this.movable = movable;
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        switch (e.getItem().toString()){
            case "Слева":
                movable.setBounds(30,30,100,49);
                break;
            case "По центру":
                movable.setBounds(150, 30, 100, 49);
                break;
            case "Справа":
                movable.setBounds(270, 30, 100,49);
                break;
        }
    }
}
