package com.controlefluxo;

import java.util.Scanner;

public class Contador {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = Integer.parseInt(terminal.nextLine());
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = Integer.parseInt(terminal.nextLine());
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException e) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro");//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
		}
		
		terminal.close();
		
	}
	
	
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		
		 int contagem = parametroDois - parametroUm;
		 if (parametroUm > parametroDois) 
			 throw new ParametrosInvalidosException();
		 
		//realizar o for para imprimir os números com base na variável contagem
		  for (int i = 0; i <= contagem; i++) {
			  System.out.println("Imprimindo o número " + i);
		  }
		
	}
	
}
