package portugol;

import java.util.Scanner;

public class Lista1ex1 {

	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		int anos=0; 
		int meses=0; 
		int dias=0; 
		int totalDias=0;
		
		System.out.printf(" Digite os anos : ");
		anos= tec.nextInt();
		
		System.out.printf(" Digite os meses: ");
		meses=tec.nextInt();
		
		System.out.printf("Digite os dias: ");
		dias= tec.nextInt();
		
		totalDias=((anos*365)+(meses*30)+1);
		
		System.out.printf("Total de dias é: %d \n", totalDias );
		
				
		tec.close();		
		

	}

}
