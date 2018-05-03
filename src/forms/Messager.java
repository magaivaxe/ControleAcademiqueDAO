/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import javax.swing.JOptionPane;

/**
 *
 * @author sire_marcos
 */
public class Messager extends JOptionPane
{
    private final String TITLE = "Contrôle Académique";

    public Messager()
    {
        super();
    }
    
    /**
     * 
     * @param msg 
     */
    public void msgBox(String msg)
    {
        showMessageDialog(null, msg);
    }
    
    /**
     * 
     * @param msg
     * @return 
     */
    public int confirBox(String msg)
    {
        int r = showConfirmDialog(null, msg,TITLE,
                                 OK_CANCEL_OPTION, 
                                 QUESTION_MESSAGE);
        return r;
    }
    
}
