package portugol;

import java.util.Scanner;

public class ExemploAula {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		String nome ;
		int anoNascimento = 0 ;
		char chefeDeFamilia;
		char genero;
		
		
		
		System.out.print("ESCREVA SEU NOME: ");
		nome = tec.next();
		
		System.out.print("Escreva seu ano de nascimento: ");
		anoNascimento = tec.nextInt();
		
		
		int idade = 2020 - anoNascimento ;
				
		
		System.out.print("Voc� � chefe de familia? S ou N:  ");
		chefeDeFamilia = tec.next().toUpperCase().charAt(0);
		
		System.out.print("Qual seu g�nero? F ou M:  ");
		genero= tec.next().toUpperCase().charAt(0);
		
		if ((chefeDeFamilia=='S') && (idade>=18 && genero== 'M' )) {
			System.out.printf("Oi, %s voc� tem %d anos e vai receber o auxilio no valor de R$600,00", nome, idade);
			
		}
		else if ((chefeDeFamilia=='S') && (idade>=18 && genero== 'F' )) {
			System.out.printf("Oi, %s voc� tem %d anos e vai receber o auxilio no valor de R$1.200,00", nome, idade);
		
		}
		
		else if (chefeDeFamilia=='N' && idade>=18) {
			
			System.out.println("Voc� n�o tem direito ao aux�lio! Desculpe!");
			
		}
		
		else if (idade<18) {
			System.out.println("Voc� n�o tem direito ao Aux�lio!");
		}
		
		else {
			
		System.out.println("Op��o inv�lida!! At� logo!"); 
		}
		
	
			tec.close();
		
    
}
	}
