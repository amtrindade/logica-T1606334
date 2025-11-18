package com.logica;

public class MainCalculadora {

	public static void main(String[] args) {
		
		Calculadora calc = new Calculadora();
		Integer total = calc.soma(4, 25);
		
		System.out.println("O valor da soma é: "+total);
		
		Calculadora calc02 = new Calculadora();
		total = calc02.soma(536, 423);
		System.out.println("O novo valor da soma é: "+total);

	}

}
