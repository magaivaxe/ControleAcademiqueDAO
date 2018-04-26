
package data;

import connection.ConnectionStudent;
import java.sql.Connection;


public abstract class DAO<T>
{
    public Connection connect = ConnectionStudent.getInstance();
    
   
    public abstract T find(String str, String par);
   
    public abstract T create(T obj);
    
    public abstract T upDate(T obj);
    
    public abstract void delete(T obj);
}
