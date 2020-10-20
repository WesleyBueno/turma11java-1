package ListaLacosRepeticao;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		/*
		 *  Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. 
		 *  Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)
		 */

		Scanner tec= new Scanner(System.in);
		
		int idade=0;
		
		int totalMenor21=0;
		int	totalMaior50=0;
		
		System.out.print("Digite sua idade: ");
		idade=tec.nextInt();
		
		
	    while(idade!=-99) {
	    	System.out.print("Digite sua idade: ");
	    	idade=tec.nextInt();   
	    
	    }
	    if(idade<21) {
	    	totalMenor21=(idade+1);
	    }
	    if(idade>50) {
	    	totalMaior50=(idade+1);
	    }
	    
	   
	    
	    System.out.println();
	    System.out.printf("\nO total de pessoas com idade abaixo dos 21 é: ", totalMenor21);
	    System.out.println();
	    System.out.printf("\nO total de pessoas com idade acima dos 50 é: ", totalMaior50);
	    
		
		tec.close();
		

	}

}
