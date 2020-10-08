package portugol;

import java.util.Scanner;

public class Lista1ex4 {

	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		int a, b, c;
		int r=0;
		int s=0;
		int d=0;
		int somaR=0;
		int somaS=0;
		
		System.out.println("Por favor, digite o valor de A: ");
		a= tec.nextInt();
		System.out.println("Por favor, digite o valor de B: ");
		b= tec.nextInt();
		System.out.println("Por favor, digite o valor de C: ");
		c= tec.nextInt();
		
		somaR = (a + b);
		somaS= (b + c);
		r= (somaR * somaR);
		s= (somaS * somaS);
		d= ((r + s)/2);
		
		System.out.println("O Valor de D é: "+d);
		
		
		tec.close();
				
		
	}


			

		



	}


