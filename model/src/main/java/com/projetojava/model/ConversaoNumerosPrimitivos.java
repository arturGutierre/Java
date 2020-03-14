package com.projetojava.model;

public class ConversaoNumerosPrimitivos {
	public static void main(String[] args) {
		
		double a = 1; //aqui acontece uma conversão implicita - 1 é inteiro mas double também suporta números inteiros
		//a saída vai ser 1.0 por causa da conversão okir!
		
		float b = 1.59685665454F; // ou float b = (float) = 1.0;  isso chama CAST // aqui acontece conversão explicita
		// a saída vai ser 1.5968567
		
		System.out.println(a);
		System.out.println(b);
		
		int c = 7;
		byte d = (byte) c; // conversão explicita 
		//saida 7
		//não deu problema por que o 7 esta dentro da capacidade do byte... ja se o numero aumentar... um byte cabe 127
		//negocios se colocar 128 vai dar erro:
		
		System.out.println(d);
		
		c = 128;
		d = (byte) c;
		
		System.out.println(d);
		
		
		
	}

}
