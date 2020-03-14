package com.projetojava.model;

public class Wrapper {
	public static void main(String[] args) {
		
		Byte b = 100;	
		Short s = 1000;	
		Integer i = 10000; // int é o tipo primitivo - muda de nome
		Long l = 100000L;
		Boolean boo = true;
		Character ca = 'M'; // char seja Wrapper ou primitivo usa aspas simples - também muda de nome
		Float flo = 231.21F;
		Double dou = 312.3245;
		
		
		System.out.println(b.byteValue());
		System.out.println(s.shortValue());
		System.out.println(i.intValue());
		System.out.println(l.longValue());
	}
}
