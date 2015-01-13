package test;

import static org.junit.Assert.*;

import org.junit.Test;

import Main.Hobbies;

public class HobbiesTest {
	
	@Test
	public void testAddHobbie() {
		Hobbies hobbies = new Hobbies();
		hobbies.addHobbie("Boxe");
		assertEquals("L'ajout d'un hobbie a echoue", true, hobbies.isHobbie("Boxe"));
		
		//fail("Not yet implemented");
	}
	@Test
	public void testDeleteHobbie() {
		Hobbies hobbies = new Hobbies();
		hobbies.addHobbie("Boxe");
		if(hobbies.isHobbie("Boxe")){
			hobbies.removeHobbie("Boxe");
			assertEquals("La suppression du hobbie a echoue", 0, hobbies.getNombreHobbies());
		}
		else{
			fail("L'ajout du hobbie de test a echoue");
		}
	}
	@Test
	public void testGetNombreHobbies() {
		Hobbies hobbies = new Hobbies();
		hobbies.addHobbie("Boxe");
		hobbies.addHobbie("Judo");
		assertEquals("Le nombre de hobbies est incorrect", 2, hobbies.getNombreHobbies());
		//fail("Not yet implemented");
	}

}
