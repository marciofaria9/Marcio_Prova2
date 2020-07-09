package br.edu.univas.main;

import java.util.Scanner;

public class Questao1 {
	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
			
		float maiorContaA = 0;
		float menorContaA = 1000000;
		float somaA = 0;
		float contaA[] = new float[12];
		
		for (int i = 0; i < 12; i++) {
			
			System.out.println("Digite o valor da conta");
			contaA[i] = leitura.nextFloat();
			
			somaA += contaA[i];
			
			if (contaA[i] > maiorContaA) {
				maiorContaA = contaA[i];			
			}
			
			if (contaA[i] < menorContaA) {
				menorContaA = contaA[i];
			}		
			
		}
		

		System.out.println("A maior conta é: " + maiorContaA);
		System.out.println("A menor conta é: " + menorContaA);
		System.out.println("A média das contas é: " + somaA / 12);					
		
		
				
		float maiorContaB = 0;
		float menorContaB = 1000000;
		float somaB = 0;
		float contaB[] = new float[12];
		
				
		for (int i = 0 ; i < 12; i++) {
			
			System.out.println("Digite o valor da conta");
			contaB[i] = leitura.nextFloat();
			
			somaB += contaB[i];
			
			if (contaB[i] > maiorContaB) {
				maiorContaB = contaB[i];			
			}
			
			if (contaB[i] < menorContaB) {
				menorContaB = contaB[i];
			}		
			
									
			
		}
		
		System.out.println("A maior conta é: " + maiorContaB);
		System.out.println("A menor conta é: " + menorContaB);
		System.out.println("A média das contas é: " + somaB / 12);		
		
		leitura.close();
		
	}

}
