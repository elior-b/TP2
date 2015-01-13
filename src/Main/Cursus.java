package Main;

public class Cursus {
	public String type;
	public String nomFiliere;
	public String specialite;

    /**
     * Constructor for objects of class Cursus
     */
    public Cursus(String type,String nomFiliere,String specialite)
    {
        // initialise instance variables
        this.type = type;
        this.nomFiliere = nomFiliere;
        this.specialite = specialite;
    }

    public String getCursus()
    {
        return type+" - "+nomFiliere+" "+specialite;
    }
    
}
