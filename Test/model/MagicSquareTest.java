package model;

import static org.junit.Assert.*;

import org.junit.Test;


public class MagicSquareTest {

	MagicSquare magicSquare;
	
	public void setupScenary1()  {
		
	}
	public void setupScenary2()  {
		
	}
	public void setupScenary3()  {

	}
	
	@Test
	public void testCreatingMagicSquare() {
		setupScenary1();
		MagicSquare magicSquare = new MagicSquare(3,"UP","NO");
	}
	
	@Test
	public void testCreatingMagicSquare2() {
		setupScenary2();
		MagicSquare magicSquare = new MagicSquare(10,"DOWN","SE");
	}
	@Test
	public void testOddNumberMethod(int n) {
		setupScenary2();
		magicSquare.oddNumber(n);	
	}
	@Test
	public void testNegativeNumber() {
		testCreatingMagicSquare2();
	}
	
	
	
	
}

