package aplicacoes;

import java.util.Scanner;
public class QuartoPrograma {

	public static void main(String[] args) 
	{
		
		//criar um teclado do programa
		Scanner tec = new Scanner(System.in);
		
		String nome;
		int anoNascimento, idade=0 ;
		double salario;
		
		
		System.out.print("Escreva o nome do Usuario: ");
		nome = tec.next();
		System.out.print("Escreva o ano de nascimento: ");
		anoNascimento= tec.nextInt();
		System.out.println("Escreva o Salario: ");
		salario= tec.nextDouble();
		idade= (2020-anoNascimento);
		System.out.printf("Oi %s, sua idade é %d em anos e seu salário %2f", nome, idade, salario);
		
		tec.close();
	}

}
