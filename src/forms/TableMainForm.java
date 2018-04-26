/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;


import javax.swing.table.DefaultTableModel;

/**
 *
 * @author eleves
 */
public class TableMainForm extends DefaultTableModel
{
    private String columnNames [] = {
        "ID",
        "Prénom",
        "Nom",
        "Mi-session",
        "Projet",
        "Examen Final",
        "Moyenne",
        "Status"
    };
    //Constructor
    public TableMainForm()
    {
        super();
        this.setColumnCount(columnNames.length);
        this.setColumnIdentifiers(columnNames);
        this.setRowCount(0);
    }
    
    public void setList()
    {
        
    }
    
}
