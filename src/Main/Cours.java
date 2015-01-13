package Main;

/**
 * Write a description of class Cours here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cours
{
    // instance variables - replace the example below with your own
    public String nomMatiere;

    /**
     * Constructor for objects of class Cours
     */
    public Cours(String matiere)
    {
        // initialise instance variables
        nomMatiere = matiere;
    }

    public String getNom()
    {
        return nomMatiere;
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void AfficheNomMatiere()
    {
        System.out.println("Cours de: "+getNom());
    }
}
