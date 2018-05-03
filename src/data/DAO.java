
package data;

import connection.ConnectionStudent;
import java.sql.Connection;
import java.util.ArrayList;

/**
 * Class base to subclasses.
 * @author mpgsa
 * @param <T> generic type for the subclasses.
 */
public abstract class DAO<T>
{
    public Connection connect = ConnectionStudent.getInstance();
    
    /**
     * 
     * @param str
     * @param par
     * @param all
     * @return 
     */
    public abstract ArrayList<T> find(String str, String par, Boolean all);
    /**
     * 
     * @param listObj
     * @return 
     */
    public abstract ArrayList<T> create(ArrayList<T> listObj);
    /**
     * 
     * @param listObj
     * @return 
     */
    public abstract ArrayList<T> upDate(ArrayList<T> listObj);
    /**
     * 
     * @param listObj
     * @return 
     */
    public abstract ArrayList<T> delete(ArrayList<T> listObj);
}
