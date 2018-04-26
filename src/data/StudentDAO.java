/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Class to do the queries to find, create (insert),
 * update and delete the datas
 * @author sire_auron
 */
public class StudentDAO extends DAO<Student>
{
    @Override
    public Student find(String id_Or_Nom, String parameter)
    {
        //New void object to fill
        Student student = new Student();
        try
        {
            //ResultSet object to receive the query result
            ResultSet result = this.connect
            .createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE, 
                    ResultSet.CONCUR_UPDATABLE
            ).executeQuery(
                "SELECT * "
              + "FROM students "
              + "WHERE " + id_Or_Nom + " = " + parameter
            );
            if(result.first())
            {
                //New object downloaded from database
                student = new Student(
                        result.getString("id"),
                        result.getString("prenom"),
                        result.getString("nom"),
                        result.getDouble("miSession"),
                        result.getDouble("projet"),
                        result.getDouble("examenFinal"),
                        result.getDouble("moyenne"),
                        result.getString("status"));
            }
        }
        catch (SQLException e){e.printStackTrace();}
        //Return the data fill class
        return student;
    }

    @Override
    public Student create(Student obj)
    {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public Student upDate(Student obj)
    {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void delete(Student obj)
    {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
