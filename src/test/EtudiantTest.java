package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import Main.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class EtudiantTest {

	@Test
	public void testAddCours() {
		
		Etudiant etudiant = new Etudiant("Tsila", "Claude");
		Cours cours1 = new Cours("maths");
		Cours cours2 = new Cours("histoire");
		etudiant.addCours(cours1);
		etudiant.addCours(cours2);
		assertEquals("L'ajout de cours est incorrect", 2,etudiant.getNombreCours(),0 );
		//fail("Not yet implemented");
	}

	@Test
	public void testRemoveCours() {
		
		Etudiant etudiant = new Etudiant("Benaroch", "Elior");
		Cours cours1 = new Cours("maths");
		Cours cours2 = new Cours("histoire");
		etudiant.addCours(cours1);
		etudiant.addCours(cours2);
		etudiant.removeCours(cours2);
		assertEquals("La suppression  de cours est incorrecte", 1,etudiant.getNombreCours(),0 );	
		//fail("Not yet implemented");
	}
	@Test
	public void testaddGraduationDate()
	{
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		String dateInString = "07/06/2013";
		Date date = null;
	 
		try
		{			
			date = formatter.parse(dateInString);	 
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		Etudiant etudiant = new Etudiant("Benaroch", "Elior");
		etudiant.addGraduationDate(date);
		assertTrue("La suppression  de cours est incorrecte", date.toString().equals(etudiant.getGraduationDate().toString()));
		
	}

}
