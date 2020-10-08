package ListaLacosRepeticao;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		/*
		 * Crie um programa que leia um número do teclado até que encontre um número igual a zero. 
		 * No final, mostre a soma dos números digitados.(DO...WHILE)
		 */
		 
			Scanner tec= new Scanner(System.in);
			int num = 1, soma = 0;
			
			do{
				System.out.print("Digite um número: ");
				num = tec.nextInt();
				soma += num;
							
			}
			while (num > 0);
			 System.out.printf("A soma é: %d",soma);
			 
			 tec.close();

	}

}
