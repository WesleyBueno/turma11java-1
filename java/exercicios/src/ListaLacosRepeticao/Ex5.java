package ListaLacosRepeticao;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		/*
		 * Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero. 
		 * No final, mostre a soma dos n�meros digitados.(DO...WHILE)
		 */
		 
			Scanner tec= new Scanner(System.in);
			int num = 1, soma = 0;
			
			do{
				System.out.print("Digite um n�mero: ");
				num = tec.nextInt();
				soma += num;
							
			}
			while (num > 0);
			 System.out.printf("A soma �: %d",soma);
			 
			 tec.close();

	}

}
