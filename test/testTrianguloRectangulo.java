package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import clases.TrianguloRectangulo;
 

class testTrianguloRectangulo {
	
	static TrianguloRectangulo normal = new TrianguloRectangulo(3,2);
	static TrianguloRectangulo basico = new TrianguloRectangulo();
	@Test
	void testAreaNormal() {
		assertEquals(3,normal.area());
	}
	@Test
	void testAreaBasico() {
		assertEquals(0.5,basico.area());
	}

	@Test
	void testHipotenusaNormal() {
		assertEquals(3.60555127,normal.hipotenusa());
	}
	
	@Test
	void testHipotenusaBasica() {
		assertEquals(1.414213562,basico.hipotenusa());
	}
	

	@Test
	void testPerimetroNormal() {
		assertEquals(8.60555127,normal.perimetro());
	}
	@Test
	void testPerimetroBasico() {
		assertEquals(3.414213562,basico.perimetro());
	}

}
