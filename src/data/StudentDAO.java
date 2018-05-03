package data;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Class to do the queries to find, create, update and delete the data.
 * @author Marcos Gomes
 */
public class StudentDAO extends DAO<Student>
{
    /**
     * Method to do the queries:
     * 1 - find a value by id or name;
     * 2 - list all students from database.
     * @param id_nom can be a value "id" or "nom".
     * @param value can be a numerical string value for id and a character value 
     * "''" for nom argument.
     * @param all true for list all and false to find an id or name value
     * @return a filled Student ArrayList
     */
    @Override
    public ArrayList<Student> find(String id_nom, String value, Boolean all)
    {
        Student student = new Student();
        ArrayList<Student> studentlist = new ArrayList<>();
        ResultSet result;
        try
        {
            if (!all) {
                result = this.connect
                .createStatement(
                        ResultSet.TYPE_SCROLL_INSENSITIVE, 
                        ResultSet.CONCUR_UPDATABLE)
                .executeQuery(
                        "SELECT * "
                        + "FROM Student "
                        + "WHERE " + id_nom + " = " + value);
            }
            else {
                result = this.connect
                .createStatement(
                        ResultSet.TYPE_SCROLL_INSENSITIVE, 
                        ResultSet.CONCUR_UPDATABLE)
                .executeQuery(
                        "SELECT * "
                        + "FROM Student");
            }
            //loop to fill the arraylist
            while (result.next()) {
                student = new Student(
                        result.getInt("id"),
                        result.getString("prenom"),
                        result.getString("nom"),
                        result.getDouble("miSession"),
                        result.getDouble("projet"),
                        result.getDouble("examenFinal"),
                        result.getDouble("moyenne"),
                        result.getString("statusFinal"));
                studentlist.add(student);
            }
        }
        catch (SQLException e){e.printStackTrace();}
        return studentlist;
    }

    @Override
    public ArrayList<Student> create(ArrayList<Student> listObj)
    {
        try
        {
            for (Student std : listObj)
            {
                //Prepare the statement to execution
                PreparedStatement prepare =
                    this.connect.prepareStatement(
                        "insert into "
                        + "Student (prenom,nom,miSession,"
                                + "projet,examenFinal,moyenne,statusFinal) "
                                + "values (?,?,?,?,?,?,?)"
                        ,Statement.RETURN_GENERATED_KEYS);
                //Set the respectives objects values to the query
                prepare.setString(1, std.getPrenom());
                prepare.setString(2, std.getNom());
                prepare.setDouble(3, std.getMiSession());
                prepare.setDouble(4, std.getProjet());
                prepare.setDouble(5, std.getExamenFinal());
                prepare.setDouble(6, std.getMoyenne());
                prepare.setString(7, std.getStatus());
                //Execute the query by update
                prepare.executeUpdate();
                //get the generated key from the query on database
                ResultSet result = prepare.getGeneratedKeys();
                //If the result exists set the generated id on the database to
                //Student object
                if (result.first())
                {std.setId(result.getInt("id"));}
            }
        }
        catch (SQLException e) { e.printStackTrace();}
        return listObj;
    }

    @Override
    public ArrayList<Student> upDate(ArrayList<Student> listObj)
    {
        ArrayList<Student> toReturn = new ArrayList<>();
        ArrayList<Student> temp;
        try
        {
            for (Student std : listObj)
            {
                PreparedStatement prepare =
                this.connect.prepareStatement(
                    "update Students "
                    + "set miSession = ?, "
                        + "projet = ?, "
                        + "examenFinal = ?, "
                        + "moyenne = ?, "
                        + "statusFinal = ?, "
                    + "where id = ?");
                prepare.setDouble(1, std.getMiSession());
                prepare.setDouble(2, std.getProjet());
                prepare.setDouble(3, std.getExamenFinal());
                prepare.setDouble(4, std.getMoyenne());
                prepare.setString(5, std.getStatus());
                prepare.setInt(6, std.getId());
                //Execute the query
                prepare.executeUpdate();
                //Find data updated to return
                temp = new ArrayList<>();
                temp = this.find("id", String.valueOf(std.getId()), false);
                toReturn.add(temp.get(0));
            }
        }
        catch (SQLException e){e.printStackTrace();}
        return toReturn;
    }

    @Override
    public ArrayList<Student> delete(ArrayList<Student> listObj)
    {
        ArrayList<Student> toReturn = new ArrayList<>();
        try
        {
            for (Student std : listObj)
            {
                this.connect
                    .createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                                     ResultSet.CONCUR_UPDATABLE
                    ).executeUpdate(
                            "delete from Students"
                                + "where id = "
                                + std.getId()
                    );
            }
            toReturn = find("", "", true);
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return toReturn;
    }
}
