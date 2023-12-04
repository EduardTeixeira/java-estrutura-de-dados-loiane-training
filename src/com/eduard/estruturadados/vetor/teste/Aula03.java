package com.eduard.estruturadados.vetor.teste;

import com.eduard.estruturadados.vetor.Vetor;

public class Aula03 {

	public static void main(String[] args) {

		Vetor vetor = new Vetor(5);

		try {
			vetor.adiciona("Elemento01");
			vetor.adiciona("Elemento02");
			vetor.adiciona("Elemento03");
			vetor.adiciona("Elemento04");
			vetor.adiciona("Elemento05");
			vetor.adiciona("Elemento06");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Saída...");

	}

}
