package test;

import static org.junit.Assert.*;

import org.junit.Test;

import Main.Cursus;

public class CursusTest {

	@Test
	public void testCreateCursus() {
		Cursus cursus = new Cursus("MASTER", "MIAGE", "IF");
		assertEquals("La creation du cursus a echouee", "MASTER - MIAGE IF",cursus.getCursus());
		//fail("Not yet implemented");
	}

}
