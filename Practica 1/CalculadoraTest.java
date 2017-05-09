import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculadoraTest {

	Calculadora c;
	
	@Before
	public void setUp(){
		c=new Calculadora();
		System.out.println("Set Up");
	}
	
	@BeforeClass
	public static void setUpBeforeClass(){
		System.out.println("beforClass");
	}
	
	@AfterClass
	public static void setUpAfterClass(){
		System.out.println("afterClass");
	}
	
	@Test
	public void sumarTest(){
		double valorEsperado = 4;
		double valorReal = c.sumar(2, 2); //2+2=4
		
		assertEquals(valorEsperado, valorReal, 0.001);
		System.out.println("sumarTest");
	}
	
	@Test
	public void restarTest(){
		double valorEsperado = 4;
		double valorReal = c.restar(5, 1); //2+2=4
		
		assertEquals(valorEsperado, valorReal, 0.001);
		System.out.println("restarTest");
	}
	
	@Test
	public void multiplicarTest(){
		double valorEsperado = 4;
		double valorReal = c.multiplicar(2, 2); //2+2=4
		
		assertEquals(valorEsperado, valorReal, 0.001);
		System.out.println("multiplicarTest");
	}
	
	@Test
	public void dividirTest(){
		double valorEsperado = 10;
		double valorReal = c.dividir(20, 2); //2+2=4
		
		assertEquals(valorEsperado, valorReal, 0.001);
		System.out.println("dividirTest");
	}
}
