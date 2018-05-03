/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listeners;

import data.Student;
import data.StudentDAO;
import forms.MainForm;
import forms.Messager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 *
 * @author sire_marcos
 */
public class DelListener implements ActionListener
{
    //Fields
    int [] selectRows;
    //Objects assignments
    StudentDAO std;
    ArrayList<Student> listUpDated, toDelete;
    MainForm myForm;

    @Override
    public void actionPerformed(ActionEvent e)
    {
        //Objects instantiation
        std = new StudentDAO();
        listUpDated = new ArrayList();
        toDelete = new ArrayList();
        myForm = MainForm.getCurrent();
        Messager msg = new Messager();
        
        if (myForm.getjTable().getSelectedRowCount() == 0)
        {
            msg.msgBox("Aucune ligne sélectionée");
        }
        else
        {
            int r = msg.confirBox("Supprimer les lignes sélectionnées?");
            if(r == msg.OK_OPTION)
            {
                int size = myForm.getjTable().getSelectedRowCount();
                selectRows = new int[size];
                selectRows = myForm.getjTable().getSelectedRows();
                toDelete = myForm.getMyTable().getRow(selectRows);
                listUpDated = std.delete(toDelete);
                myForm.getMyTable().setRows(listUpDated, listUpDated.size());
            }
        }
        
        
    }
    
}
