/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listeners;

import data.Student;
import data.StudentDAO;
import forms.MainForm;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 *
 * @author sire_marcos
 */
public abstract class BaseListeners implements ActionListener
{
    StudentDAO std = new StudentDAO();
    ArrayList<Student> list = new ArrayList<>();
    MainForm myForm = MainForm.getCurrent();
}
