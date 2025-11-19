package com.logica;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
	
	private Calculadora calc;

	@BeforeEach
	public void setUp() throws Exception {
		calc = new Calculadora();	
	}

	@Test
	public void testSomaValoresPositivos() {			
		Integer total = calc.soma(400, 351);		
		Assertions.assertEquals(751, total);		
	}
	
	@Test
	public void testSomaValoresNegativos() {			
		Integer total = calc.soma(-5, -10);		
		Assertions.assertEquals(-15, total);		
	}
	
	@Test
	public void testSomaComZero() {			
		Integer total = calc.soma(0, 4);		
		Assertions.assertEquals(4, total);		
	}
	
	@Test
	public void testSubtracaoValor1Maior() {
		Integer total = calc.subtracao(14, 9);
		Assertions.assertEquals(5, total);
	}
	
	@Test
	public void testSubtracaoValor2Maior() {
		Integer total = calc.subtracao(2, 20);
		Assertions.assertEquals(18, total);
	}
	
	@Test
	public void testSubracaoIgual() {
		Integer total = calc.subtracao(10, 10);
		Assertions.assertEquals(0, total);
	}
	
	@Test
	public void testFatorialCinco() {
		Integer fatorial = calc.fatorial(5);
		Assertions.assertEquals(120, fatorial);
	}
	
	@Test
	public void testFatorialQuatro() {
		Integer fatorial = calc.fatorial(4);
		Assertions.assertEquals(24, fatorial);
	}
	
	@Test
	public void testFatorialZero() {
		Integer fatorial = calc.fatorial(0);
		Assertions.assertEquals(1, fatorial);
	}
	
	@Test
	public void testFatorialUm() {
		Integer fatorial = calc.fatorial(1);
		Assertions.assertEquals(1, fatorial);
	}
	
	@Test
	public void testFatorialDois() {
		Integer fatorial = calc.fatorial(2);
		Assertions.assertEquals(2, fatorial);
	}
	
	@Test
	public void testFatorialNegativo() {
		Integer fatorial = calc.fatorial(-2);
		Assertions.assertEquals(null, fatorial);
	}
	
	

}
