/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;


import data.Student;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author eleves
 */
public class MainTable extends DefaultTableModel
{
    private String [] columnNames = {
        "ID",
        "Prénom",
        "Nom",
        "Mi-session",
        "Projet",
        "Examen Final",
        "Moyenne",
        "Status"
    };
    /**
     * 
     */
    public MainTable()
    {
        super();
        this.setColumnCount(columnNames.length);
        this.setColumnIdentifiers(columnNames);
        this.setRowCount(0);
    }
    /**
     * 
     * @param list
     * @param actualLength 
     */
    public void setRows(ArrayList<Student> list, int actualLength)
    {
        this.setRowCount(0);
        for (int i = 0; i < actualLength; i++)
        {
            Object [] line = new Object[columnNames.length];
            line[0] = list.get(i).getId();
            line[1] = list.get(i).getPrenom();
            line[2] = list.get(i).getNom();
            line[3] = list.get(i).getMiSession();
            line[4] = list.get(i).getProjet();
            line[5] = list.get(i).getExamenFinal();
            line[6] = list.get(i).getMoyenne();
            line[7] = list.get(i).getStatus();
            this.addRow(line);
        }
    }
    /**
     * Method to get the data from the current row. It create an Object[] line
     * to get values from a specific row.
     * @param row - Current row
     * @return Line object with all data from the current row
     */
    public ArrayList<Student> getRow(int [] row)
    {
        ArrayList<Student> toReturn = new ArrayList();
        for (int j = 0; j < row.length; j++)
        {
            Student student = new Student();
            String[] line = new String[columnNames.length];
            for (int i = 0; i < columnNames.length; i++)
            {
                line[i] = this.getValueAt(row[j], i).toString();
            }
            student.setId(Integer.parseInt(line[0])); 
            student.setPrenom((line[1]));
            student.setNom(line[2]);
            student.setMiSession(Double.parseDouble(line[3]));
            student.setProjet(Double.parseDouble(line[4]));
            student.setExamenFinal(Double.parseDouble(line[4]));
            student.setMoyenne(Double.parseDouble(line[4]));
            student.setStatus(line[7]);
            toReturn.add(student);
        }
        return toReturn;
    }
    
}
