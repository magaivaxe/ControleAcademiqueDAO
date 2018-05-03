package data;

/**
 * Class to receive and create students objects
 * @author Marcos Gomes
 */
public class Student
{
    private int id;
    private String prenom,nom,status;
    private double miSession, projet, examenFinal, moyenne;
    
    private final double W_MI_SESSION = 0.3;
    private final double W_PROJET = 0.3;
    private final double W_EXAMEN_FINAL = 0.4;
    
    //Standard constructor to create a void object
    public Student(){}
    
    //Parametric constructor to receives values from database
    public Student(int id,String prenom,String nom,double miSession,
                   double projet,double examenFinal,double moyenne,
                   String status)
    {
        this.id = id;this.prenom = prenom;this.nom = nom;this.status = status;
        this.miSession = miSession;this.projet = projet;
        this.examenFinal = examenFinal;this.moyenne = moyenne;
        this.status = status;
    }

    //Parametric constructor to insert values to database
    public Student(int id, String prenom, String nom, double miSession,
                   double projet, double examenFinal)
    {
        this.id = id;this.prenom = prenom;this.nom = nom;
        this.miSession = miSession;this.projet = projet;
        this.examenFinal = examenFinal;
        //Calculate the average
        this.moyenne = miSession * W_MI_SESSION 
                     + projet * W_PROJET
                     + examenFinal * W_EXAMEN_FINAL;
        //Status value in moyenne function
        this.status = moyenne >= 60 ? "succès":"échec";
    }
    
    public void setId(int id)
    {
        this.id = id;
    }

    public void setPrenom(String prenom)
    {
        this.prenom = prenom;
    }

    public void setNom(String nom)
    {
        this.nom = nom;
    }
    
    public void setMiSession(double miSession)
    {
        this.miSession = miSession;
    }

    public void setProjet(double projet)
    {
        this.projet = projet;
    }

    public void setExamenFinal(double examenFinal)
    {
        this.examenFinal = examenFinal;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }

    public void setMoyenne(double moyenne)
    {
        this.moyenne = moyenne;
    }
    

    public int getId()
    {
        return id;
    }

    public String getPrenom()
    {
        return prenom;
    }
    
    public String getNom()
    {
        return nom;
    }
   
    public double getMiSession()
    {
        return miSession;
    }

    public double getProjet()
    {
        return projet;
    }

    public double getExamenFinal()
    {
        return examenFinal;
    }

    public double getMoyenne()
    {
        return moyenne;
    }
    
    public String getStatus()
    {
        return status;
    }

    @Override
    public String toString()
    {
        return "Student{" 
                + "id=" + id 
                + ", prenom=" + prenom 
                + ", nom=" + nom 
                + ", miSession=" + miSession 
                + ", projet=" + projet 
                + ", examenFinal=" + examenFinal 
                + ", moyenne=" + moyenne 
                + ", status=" + status 
                + '}';
    }
}
