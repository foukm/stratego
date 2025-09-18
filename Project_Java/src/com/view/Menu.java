package com.view;

import javax.swing.*;
import  javax.swing.JPopupMenu;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Menu  implements ActionListener {

    private static volatile boolean reduced;
    private  JLabel messageLabel1;
    private JFrame window = new JFrame();
    public Menu()
    {


            ImageIcon logo = new ImageIcon("ice-fire.jpg");
            window.setSize(1000,1000);
            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            messageLabel1 = new JLabel("Choose army crowd: ",JLabel.CENTER);
            JPopupMenu popupMenu= new JPopupMenu();
            popupMenu.add(messageLabel1);
            JMenuItem item1 = new JMenuItem("Reduced");
            item1.addActionListener(this);
            item1.setActionCommand("Reduced");
            popupMenu.add(item1);
            JMenuItem item2 = new JMenuItem("Normal");
            item2.addActionListener(this);
            item2.setActionCommand("Normal");
            popupMenu.add(item2);
            window.setVisible(true);
            popupMenu.show(window,200,200);
            popupMenu.setPopupSize(400,400);
            window.setVisible(true);
    }

    /**
     * Function sets if the army is reduced or not
     * @param reduced stores if the army is reduced or not
     * */
    private void setArmyCrowd(boolean reduced)
    {
        this.reduced = reduced;

    }
    /**
     *
     * @return if the army is reduced or not
     * */
    public boolean getArmyCrowd()
    {
        return this.reduced;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            synchronized (this)
            {
                switch (command)
                {
                    case "Reduced":
                        setArmyCrowd(true);
                        window.setVisible(false);
                        notify();
                        break;
                    case "Normal":
                        setArmyCrowd(false);
                        window.setVisible(false);
                        notify();
                        break;
                }
            }
    }
}
