/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.uma.ctesp.ExemploInterface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author joaogouveia
 */
public class ButtonClickListener implements ActionListener{

    private final JFrameExample frame;

    ButtonClickListener(JFrameExample frame) {
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //String command = e.getActionCommand();
        JButton button = (JButton) e.getSource();
        System.out.println(button.getText());
        frame.getjLabelTop().setText( button.getText() + " Was Clicked");
        frame.getjLabelBottom().setText(e.paramString());
    }
    
}
