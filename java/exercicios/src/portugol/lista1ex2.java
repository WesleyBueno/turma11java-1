package portugol;

import java.util.Scanner;

public class lista1ex2 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int a, m, d, dias; 
		dias=0;
		a=0;
		m=0;
		d=0;
		
		System.out.print("\n Digite quantos dias de idade vc tem?: ");
		dias= tec.nextInt();
		
		a=(dias/365);
		m=(dias%365)/30;
		d=((dias%365)%30);
		System.out.printf("Você tem %d anos ,  %d meses ,  %d dias", a,m, d);
		
		tec.close();
		
	

	}

}
