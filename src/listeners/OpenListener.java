/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listeners;

import data.Student;
import data.StudentDAO;
import forms.MainTable;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 *
 * @author sire_marcos
 */
public class OpenListener implements ActionListener
{
    //Fields
    private final String VIDE = "";
    private final boolean ALL = true;
    //Objects assignments
    StudentDAO std;
    ArrayList<Student> list;
    MainTable myTable;
    
    //Method to fill Maintable 
    @Override
    public void actionPerformed(ActionEvent e)
    {
        //Objects instantiation
        std = new StudentDAO();
        list = new ArrayList();
        myTable = new MainTable();
        
        list = std.find(VIDE, VIDE, ALL);
        myTable.setRows(list, list.size());
    }
    
}
