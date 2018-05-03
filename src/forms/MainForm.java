/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

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
    private final int BDR = 5;
    
    //Objects assignments
    private MenusMainForm menus;
    private JPanel contentPane;
    private JScrollPane scrollPane;
    private MainTable myTable;
    private JTable jTable;
    /*
    This static object is used to access to same object by listeners or others
    to modify it by getters. Without it the access is impossible. 
    */
    static MainForm current;
    
    /**
     * Constructor to call the menus and table
     */
    public MainForm()
    {
        MainForm.current = this;
        setResizable(false);
        getContentPane().setEnabled(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(X, Y, WIDTH, HEIGTH);
        //Menus
        menus = new MenusMainForm();
        this.setJMenuBar(menus);
        //Table
        myTable = new MainTable();
        jTable = new JTable(myTable);
        //ScrollPane
        scrollPane = new JScrollPane(jTable);
        scrollPane.setBounds(0, 0, WIDTH, HEIGTH);
        //ContentPane
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(BDR, BDR, BDR, BDR));
        this.setContentPane(contentPane);
        contentPane.setLayout(null);
        contentPane.add(scrollPane);
        
    }

    public MainTable getMyTable()
    {
        return myTable;
    }

    public JTable getjTable()
    {
        return jTable;
    }
    
    public static MainForm getCurrent()
    {
        return current;
    }
    
    
    
}
