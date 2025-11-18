package com.logica;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Variables {

	public static void main(String[] args) {
		
		//Variáveis do tipo String
		String name = "Antônio";
		String fullName = "Trindade";
		
		System.out.println("O nome completo é "+ name +" "+ fullName);
		
		
		//Variáveis do tipo Integer
		Integer valor01 = 5;
		Integer valor02 = 18;
		
		Integer soma = valor01 + valor02;
		
		System.out.println("O valor da soma é: "+ soma);
		
		//Variáveis do tipo Double
		Double valor03 = 48.36;
		Double valor04 = 5.12;
		
		Double total = valor03 * valor04;
		
		System.out.println("O valor total é: " + String.format("%.2f", total));
		
		//Variáveis do tipo Boolean
		// && = AND
		// || = OR
		
		Boolean casado = true;
		Integer idade = 40;
		
		if ((casado == true) && (idade > 40))  {
			System.out.println("A pessoa é casada com mais de 40 anos!");
		}	
		else if ((casado == true) && (idade <= 40)) {
			System.out.println("A pessoa é casada e tem 40 anos ou menos");
		}
		else {
			System.out.println("A pessoa NÃO é casada!");
		}
		
		//Variaveis do tipo Date
		Date dataAtual = new Date();
		System.out.println("A data atual é: "+dataAtual);
		
		//Conversão de String para Integer
		Integer year = Integer.parseInt("2025");
		Double salary = Double.parseDouble("6500.00");
		
		System.out.println("O ano é: "+year);
		System.out.println("O salário é "+salary);
		
		//looping com valor inicial e final
		for (int i = 1; i <= 10; i++) {
			System.out.println("O valor de i é: "+ i);			
		}
		
		//looping com while
		int i = 1;
		while(i <= 10) {
			System.out.println("O valor de i no While é: "+i);
			i++; //i = i + 1;
		}
		
		//looping em lista/coleção
		
		List<String> produtos = new ArrayList<String>();
		
		produtos.add("Galaxy 20s");
		produtos.add("iPhone 15");
		produtos.add("Booby Goods");
		produtos.add("Fone de ouvido JBL");
		
		for (String produto : produtos) {
			System.out.println("O produto agora é "+produto);			
		}
		
		System.out.println("O tamanho da lista é: "+produtos.size());
		System.out.println("O terceiro elemento da lista é "+produtos.get(2));			
	}

}
