
package listeners;

import data.Student;
import forms.Messager;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

/**
 * 
 * @author sire_marcos
 */
public class DelListener extends BaseListeners
{
    /**
     * 
     * @param e 
     */
    @Override
    public void actionPerformed(ActionEvent e)
    {
        //Objects instantiations
        ArrayList<Student> toDelete = new ArrayList();
        Messager msg = new Messager();
        
        if (myForm.getjTable().getSelectedRowCount() == 0)
        {msg.msgBox("Aucune ligne sélectionée");}
        else
        {
            int r = msg.confirBox("Supprimer les lignes sélectionnées?");
            if(r == msg.OK_OPTION)
            {
                int size = myForm.getjTable().getSelectedRowCount();
                int [] selectRows = new int[size];
                selectRows = myForm.getjTable().getSelectedRows();
                toDelete = myForm.getMyTable().getRow(selectRows);
                list = std.delete(toDelete);
                myForm.getMyTable().setRows(list, list.size());
            }
        } 
    }
}
