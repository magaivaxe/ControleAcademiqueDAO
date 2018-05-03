
package listeners;


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
