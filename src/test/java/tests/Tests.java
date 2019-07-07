package tests;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import domain.Bag;
import domain.Multimedia;

public class Tests {

	Bag b1, b2;
	Multimedia c1, c2;
	
	@Before
	public void init() {
		c1 = new Multimedia("Jojo's Bizarre Adventures: Golden Wind", "", "/home/utnso/jojo5.avi");
		c2 = new Multimedia("Jojo's Bizarre Adventures: Stardust Crusaders", "", "/home/utnso/jojo3.avi");
		b2 = new Bag("Really best jojo parts", Arrays.asList(c2));
		b1 = new Bag("Best jojo parts", Arrays.asList(c1, b2));	
	}
	
	@Test
	public void unaBagConUnaCancionYOtraBagTieneComoContenidoDosCanciones() {
		assertEquals(Arrays.asList(c1, c2), b1.getContenido());
	}
	
}
