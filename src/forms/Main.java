/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import data.StudentDAO;
import javax.swing.JFrame;

/**
 *
 * @author eleves
 */
public class Main
{
    static JFrame mainForm;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        mainForm = new MainForm();
        mainForm.setVisible(true);
        
        StudentDAO test = new StudentDAO();
        
        System.out.println(test.find("prenom", "not null", true));
    }
    
}
