
package data;

import connection.ConnectionStudent;
import java.sql.Connection;
import java.util.ArrayList;


public abstract class DAO<T>
{
    public Connection connect = ConnectionStudent.getInstance();
    
    
    public abstract ArrayList<T> find(String str, String par, Boolean all);
    
    public abstract ArrayList<T> create(ArrayList<T> listObj);
    
    public abstract ArrayList<T> upDate(ArrayList<T> listObj);
    
    public abstract void delete(T obj);
}
