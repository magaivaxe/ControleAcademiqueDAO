/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import javax.swing.JFrame;

/**
 *
 * @author eleves
 */
public class MainForm extends JFrame
{
    //Private fields
    private final int X = 100;
    private final int Y = 100;
    private final int WIDTH = 700;
    private final int HEIGTH = 500;
    
    //Menus object
    private MenusMainForm menus;
    
    /**
     * Constructor to call the menus and table
     */
    public MainForm()
    {
        setResizable(false);
        getContentPane().setEnabled(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(X, Y, WIDTH, HEIGTH);
        //Menus
        menus = new MenusMainForm();
        this.setJMenuBar(menus);
    }
    
}
