package com.projetojava.model;

import java.util.Scanner;

public class NotacaoPonto {

	public static void main(String[] args) {
		
		
		String texto = "Artur X";
		//Vai converter a variável texto para letras maísculas
		texto = texto.toUpperCase();
		//Vai substituir um char (X) por outro char ou String
		texto = texto.replace("X", "Guti");
		texto = texto.concat("rsrsrsrs");
		System.out.println(texto.concat("e_e"));
		System.out.println(texto.startsWith("hey hey"));
		System.out.println(texto.equals("hello"));
		System.out.println(texto.equalsIgnoreCase("Guti"));
		// Tipos primitivos nao usam . okir!
		
		
		String nome = "Laura";
		Integer idade = 21;
		
		System.out.printf("Nome: %s %d ", nome, idade); //outra forma de concatenar String
		//o primeiro %S substitui nome e o %d a idade s=texo d=numeros inteiros ((%f numeros com pontos flutuantes
		
		Scanner insira = new Scanner (System.in);
		
		System.out.println("Qual o seu nome?: ");
		String nome1 = insira.nextLine();
		System.out.println("Qual a sua idade?: ");
		Integer idade1 = insira.nextInt();
		
		System.out.printf("%s tem %d anos de idade", nome1, idade1);
		
		insira.close(); //fecha scanner
	}
	
	
	
}
