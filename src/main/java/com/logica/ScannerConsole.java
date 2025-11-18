package com.logica;

import java.util.Scanner; // 1. Importe a classe

public class ScannerConsole {

	public static void main(String[] args) {
		
		// 2. Crie um objeto Scanner lendo do console (System.in)
        Scanner scanner = new Scanner(System.in); 

        // 3. Peça o dado (em Java, o prompt é manual)
        System.out.print("Digite seu nome: "); 

        // 4. Leia a linha inteira (como o input() do Python)
        String nome = scanner.nextLine(); 

        // 5. Use o valor
        System.out.println("Olá, " + nome + "! Bem-vindo(a)");

        // 6. (Boa prática) Feche o scanner
        scanner.close();

	}

}
