package Laba2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class InfoButton implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        String message = "";
        message += "Ларионов Кирилл Александрович 21130374"
                + "\n"
                + "Шангареев Камиль Разитович 21130437";
        JOptionPane.showMessageDialog(null, message,"Информация", JOptionPane.PLAIN_MESSAGE);

    }

}
