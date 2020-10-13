package portugol;

import java.util.Scanner;
import java.lang.Math;

public class Lista1ex6 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		int x1,y1,x2,y2;
		double raiz = 0;
		double soma=0;
		double quadrado1=0;
		double quadrado2 =0;
		double distancia= 0;
		double sub1=0;
		double sub2 =0;

		System.out.println("Por favor informe a posição x do primeiro plano: ");
		x1= tec.nextInt();
		
		System.out.println("Por favor informe a posição y do primeiro plano: ");
		y1= tec.nextInt();
		
		System.out.println("Por favor informe a posição x do segundo plano: ");
		x2= tec.nextInt();
		
		System.out.println("Por favor informe a posição y do segundo plano: ");
		y2= tec.nextInt();
		
		sub1 = (x1 - x2);
		sub2 = ( y1 - y2);
		
		quadrado1 = (sub1*sub1);
		quadrado2 =(sub2*sub2);
		soma =(quadrado1 + quadrado2);
		
		

		
		//realizar o calculo da raiz quadrada
	  
		
		//Saida

		System.out.printf("A distância entre os pontos indicados é de: ", raiz);
	
	}

}
