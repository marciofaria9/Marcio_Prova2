package br.edu.univas.main;

import java.util.Scanner;

public class Questao3 {
	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		
		float salario[] = new float[150];
		float folhaSalarial = 0;
		float folhaComAumento = 0;
		
				
		for (int i = 0; i < 150; i++) {
			
			System.out.println("Digite o sal�rio"); 
			salario[i] = leitura.nextFloat();
			folhaComAumento = folhaComAumento + (salario[i]	* 1.15f);	
			folhaSalarial += salario[i];		
	
			
			
		}
		
		System.out.println("A folha salarial sem aumento �: " + folhaSalarial);
		System.out.println("A folha salarial com aumento �: " + folhaComAumento) ;
		
		leitura.close();	
		
	}

}

