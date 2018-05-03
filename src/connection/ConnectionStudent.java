/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author eleves
 */
public class ConnectionStudent
{
    private static String dataBase = "studentDB";
    //URL connection
    private static String URL = "jdbc:mysql://localhost/" + dataBase;
    //User name
    private static final String USER = "root";
    //Password
    private static final String PASSWORD = "mp09s02g00";
    //Object connection
    private static Connection connect;
    /**
     * 
     * @return 
     */
    public static Connection getInstance()
    {
        if (connect == null){
            try{
                connect = DriverManager.getConnection(URL,USER,PASSWORD);
            }
            catch (SQLException e){
                e.printStackTrace();
            }
        }
        return connect;
    }

    public static String getDataBase()
    {
        return dataBase;
    }

    public static void setDataBase(String dataBase)
    {
        ConnectionStudent.dataBase = dataBase;
    }
    
    
}
