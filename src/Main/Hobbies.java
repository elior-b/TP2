package Main;

import java.util.ArrayList;

public class Hobbies {
	public ArrayList<String> hobbies;
	
	public Hobbies(){
		hobbies = new ArrayList<String>();
	}
	
	public int getNombreHobbies()
    {
    	return hobbies.size();
    }
    public void addHobbie(String unHobbie)
    {
    	hobbies.add(unHobbie);
    }
    public void removeHobbie(String unHobbie)
    {
    	if(hobbies.contains(unHobbie))
    	{
    		hobbies.remove(unHobbie);	
    	}	
    }
    public boolean isHobbie(String unHobbie)
    {
    	if(hobbies.contains(unHobbie))
    	{
    		return true;	
    	}
    	return false;
    }
}
