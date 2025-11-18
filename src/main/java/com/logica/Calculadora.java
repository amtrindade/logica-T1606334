package com.logica;

public class Calculadora {
		
	public Integer soma(Integer valor1, Integer valor2) {
		return valor1 + valor2;		
	}
	
	public Integer subtracao(Integer valor1, Integer valor2) {
		Integer total;
		
		if (valor1 > valor2) {
			total = valor1 - valor2;			
		}
		else if (valor2 > valor1) {
			total = valor2 - valor1;
		}
		else {
			total = 0;
		}
		return total;		
	}
}
