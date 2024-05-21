
package DesafioControleFluxo;
import java.util.Scanner;

public class Contador {
	public static void main(String[]args) {
		
		Scanner terminal=new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm=terminal.nextInt();
		System.out.println("Digite o segundo parâmentro");
		int parametroDois=terminal.nextInt();
		 
		try{contar(parametroUm,parametroDois);
		
			
	}catch(ParametrosInvalidosException e) {
		System.out.println("O segundo parâmetro deve ser maior que o primeiro");

	}
	}
	

	 static void contar(int num1 , int num2)throws ParametrosInvalidosException {
		if(num1>num2)
			throw new ParametrosInvalidosException();
		int numeroContagem=num2-num1;
		for (int c=1;c<=numeroContagem;c++) {
			System.out.println("Imprimindo o número "+c);
			
		}

	}}
