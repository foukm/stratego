package com.view;

import com.controller.Controller;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//import controller.Controller;


public class GraphicUI extends JFrame{
    private JButton b[][] = new JButton[8][10];
    private int i,j;
    private static int row;
    private  static int col;
    private String path;
    private static volatile boolean buttonPushed;

    /**
     * <pre>
     *     <b>It is the constructor. It makes an 2D array of JButtons
     *   . Also, it appears the suitable image in the suitable JButton with the buttons representing the Pieces. Moreover, it appears the logo of the game and control others details for the view of the game before this starts.</b>
     * </pre>
     *
     */
    public GraphicUI(){
        row=0;
        col=0;
        this.setTitle("Stratego");
        buttonPushed=false;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        ImageIcon logo = new ImageIcon("logo.jpg");
        this.setSize(800,1000);
        this.setIconImage(logo.getImage());
        this.setLayout(new GridLayout(8,10,2,2));
        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int row = 0; row < 8; row++) {
                    for (int col = 0; col < 10; col++) {
                        if (b[row][col] == e.getSource())
                        {
                           GraphicUI.row= row;
                           GraphicUI.col=col;
                           /* System.out.println(" "+row + " "+ col);*/
                        }

                    }
                }

                if(e.getSource()== b[row][col])
                {
                    //ImageIcon icon = new ImageIcon("./src/images/"+"Red/Mage.png");
                    //b[row][col].setIcon(icon);
                    buttonPushed =true;
                }
            }
        };

        for(int i=0; i<8; i++)
        {
            for(int j=0; j<10; j++) {
                b[i][j] = new JButton();
                b[i][j].setSize(165,242);
                if ((i == 3 && (j==2 || j==3 || j==6 || j==7)) || ((i == 4 && (j==2 || j==3 || j==6 || j==7)))) {
                    b[i][j].setSelected(false);
                    b[i][j].setBackground(Color.yellow);
                }
                this.add(b[i][j]);
                b[i][j].addActionListener(al);
            }
        }
        this.setVisible(true);
    }


    /**
     * <pre>
     *     <b>Precondition:</b>
     * </pre>
     * <pre>
     *     <b>Postcondition:sets an image in the [x,y] position. </b>
     * </pre>
     * @param x row
     * @param y col
     * @param path  this is the path of the image
     */
    public void setAnImage(int x, int y, String path)
    {
        ImageIcon icon = new ImageIcon(path);
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(b[i][j].getWidth(),b[i][j].getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        b[x][y].setIcon(scaledIcon);
    }



    /**
     * <pre>
     *     <b>Precondition:</b>
     * </pre>
     * <pre>
     *     <b>Postcondition: makes the JButton which is in the position [x,y] available, white color </b>
     * </pre>
     * @param x dimension value - x
     * @param y dimension value - y
     */
    public void removeAnImage(int x, int y)
    {
        b[x][y].setIcon(null);
    }

    /**
     * <pre>
     *     <b>Precondition:</b>
     * </pre>
     * <pre>
     *     <b>Postcondition: makes all the JButtons not selected</b>
     * </pre>
     */
    public void finishTurn()
    {
        for(int i=0; i<8; i++)
        {
            for(int j=0; j<10; j++)
            {
                b[i][j].setSelected(false);
            }
        }
    }


    /**
     * <pre>
     *     <b>Precondition:</b>
     * </pre>
     * <pre>
     *     <b>Postcondition: returns the row </b>
     * </pre>
     * @return the row
     */
    public int getRow()
    {
        return this.row;
    }

    /**
     * <pre>
     *     <b>Precondition:</b>
     * </pre>
     * <pre>
     *     <b>Postcondition: returns the col </b>
     * </pre>
     * @return the col
     */
    public int getCol()
    {
        return this.col;
    }


    /**
     * <pre>
     *     <b>Precondition:</b>
     * </pre>
     * <pre>
     *     <b>Postcondition: waits until a JButton to be pressed </b>
     * </pre>
     * @return then button pushed
     */
    public boolean waitForAction()
    {
        /*System.out.println("in waitForAction in GUI");*/
        while(buttonPushed==false) {;}
        buttonPushed=false;
        return true;
    }


    /**
     * <pre>
     *     <b>Precondition:</b>
     * </pre>
     * <pre>
     *     <b>Postcondition:makes all the JButtons not enable </b>
     * </pre>
     */
    public void setButtonDisable()
    {
        for(int i=0; i<8; i++)
        {
            for(j=0; j<10; j++)
            {
                b[i][j].setEnabled(false);
            }
        }
    }






/*
    @Override
    public void actionPerformed(ActionEvent e) {

        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 10; col++) {
                if (b[row][col] == e.getSource())
                {
                    this.row = row;
                    this.col=col;
                    System.out.println(" "+row + " "+ col);
                }

            }
        }



        if(e.getSource()== b[row][col])
        {
            ImageIcon icon = new ImageIcon("./src/images/"+"Red/Mage.png");
            b[row][col].setIcon(icon);
        }
    }*/


}