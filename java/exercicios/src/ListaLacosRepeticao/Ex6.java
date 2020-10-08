package ListaLacosRepeticao;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		/*
		 * Escrever um programa que receba vários números inteiros no teclado. 
		 * E no final imprimir a média dos números múltiplos de 3. 
		 * Para sair digitar 0(zero).(DO...WHILE)
		 */
		
		Scanner tec= new Scanner(System.in);
		
		int num = 1, soma = 0, quant =0;
		
		do{
			System.out.print("Digite um número: ");
			num = tec.nextInt();

			if((num % 3) == 0 && num > 0) {
				soma += num;
				quant += 1;
			}				
		}
		while (num > 0);
		 System.out.printf("A média é: %d",(soma/quant));
		 tec.close();
	}

}
