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
    //URL connection
    private static final String URL = "jdbc:mysql://localhost/studentDB";
    //User name
    private static final String USER = "root";
    //Password
    private static final String PASSWORD = "colocar";
    //Object connection
    private static Connection connect;
    //Method connection
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
}
