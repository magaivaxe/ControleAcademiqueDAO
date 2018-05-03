/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listeners;


import forms.MainForm;
import java.awt.event.ActionEvent;

/**
 *
 * @author sire_marcos
 */
public class OpenListener extends BaseListeners
{
    @Override
    public void actionPerformed(ActionEvent e)
    {
        //Variables
        final String VIDE = "";
        final boolean ALL = true;
        
        list = std.find(VIDE, VIDE, ALL);
        myForm.getMyTable().setRows(list, list.size());
    }
}
