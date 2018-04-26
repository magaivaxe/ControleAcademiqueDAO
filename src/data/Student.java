/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author eleves
 */
public class Student
{
    //Class fields
    private String id,prenom,nom,status;
    private double miSession, projet, examenFinal, moyenne;
    
    private final double W_MI_SESSION = 0.3;
    private final double W_PROJET = 0.3;
    private final double W_EXAMEN_FINAL = 0.4;
    
    /**
     * 
     */
    public Student()
    {
    }
    
    /**
     * Parametric constructor
     * @param id
     * @param prenom
     * @param nom
     * @param miSession
     * @param projet
     * @param examenFinal
     * @param moyenne
     * @param status 
     */
    public Student(String id, 
                   String prenom, 
                   String nom, 
                   double miSession, 
                   double projet, 
                   double examenFinal, 
                   double moyenne, 
                   String status)
    {
        this.id = id;
        this.prenom = prenom;
        this.nom = nom;
        this.status = status;
        this.miSession = miSession;
        this.projet = projet;
        this.examenFinal = examenFinal;
        this.moyenne = moyenne;
        this.status = status;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public void setPrenom(String prenom)
    {
        this.prenom = prenom;
    }

    public String getNom()
    {
        return nom;
    }

    public void setNom(String nom)
    {
        this.nom = nom;
    }
    
    
    public void setStatus()
    {
        this.status = moyenne >= 60 ? "approuvé":"échec";
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

    public void setMoyenne()
    {
        this.moyenne = this.miSession * W_MI_SESSION 
                     + this.projet * W_PROJET
                     + this.examenFinal * W_EXAMEN_FINAL;
    }
    
    public String getId()
    {
        return id;
    }

    public String getPrenom()
    {
        return prenom;
    }

    public String getStatus()
    {
        return status;
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

    @Override
    public String toString()
    {
        return "Student{" + "id=" + id 
                + ", prenom=" + prenom 
                + ", nom=" + nom 
                + ", status=" + status 
                + ", miSession=" + miSession 
                + ", projet=" + projet 
                + ", examenFinal=" + examenFinal 
                + ", moyenne=" + moyenne + '}';
    }
    
    
}
