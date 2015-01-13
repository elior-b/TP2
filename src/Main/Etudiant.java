package Main;
import java.util.*;
/**
 * Write a description of class Etudiant here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Etudiant
{
    // instance variables - replace the example below with your own
    public String nom;
    public String prenom;
    public ArrayList<Cours> list;
    public Cursus cursus;
    public Hobbies hobbies;

    /**
     * Constructor for objects of class Etudiant
     */
    public Etudiant(String nom, String prenom)
    {
        // initialise instance variables
        this.nom = nom;
        this.prenom = prenom;
        list = new ArrayList<Cours>();
        hobbies = new Hobbies();
        
    }
    
    public String getNom()
    {
        return nom;
    }
    
     public String getPrenom()
    {
        return prenom;
    }
    public int getNombreCours()
    {
    	return list.size();
    }
    public void addCours(Cours c)
    {
    	list.add(c);
    }
    public void removeCours(Cours c)
    {
    	if(list.contains(c))
    	{
    		list.remove(c);
    		
    	}
    	
    }
    public void setCursus(String type,String nomFiliere,String specialite){
    	cursus = new Cursus(type, nomFiliere, specialite);
    }
    public void AfficheCursus()
    {
        System.out.println(cursus.getCursus());
    }
    

    /**
     * Cette methode permet de mettre le nom et le prenom de l'etudiant en maj et de les afficher
     */
    public void transformInfoEnCapital()
    {
        nom = nom.toUpperCase();
        prenom = prenom.toUpperCase();
        //System.out.println("L'étudiant s'appel "+getNom()+" "+getPrenom());
    }



    /**
     * Cette méthode collabore avec la methode de la class Cours
     */
    public void afficheLesMatieres()
    {
        // put your code here
        System.out.println(getNom()+" "+getPrenom()+" a les cours suivants :");
        for(int i=0; i<list.size(); i++)
        {
            list.get(i).AfficheNomMatiere();
        }
    }

}
