package ListaLacosDecisaoJava;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int a, b, c;
		
		System.out.print("Digite o valor de A: ");
		a = tec.nextInt();
		
		System.out.print("Digite o valor de B: ");
		b = tec.nextInt();
		
		System.out.print("Digite o valor de C: ");
		c = tec.nextInt();
		
		if(a > b && a > c) {
			System.out.printf("O valor valor digitado foi A %d",a);
		}
		else if(b > a && b > c) {
			System.out.printf("O maior valor digitado foi B %d",b);
			
		}
		else {
			System.out.printf("O maior valor digitado foi C %d ",c);
		}
		
		System.out.println((a>b && a>c)?"A maior ":(b>a&&b>c)?"B maior ":"C maior ");
			
		
		tec.close();

		}
		
		   
		   
	}


