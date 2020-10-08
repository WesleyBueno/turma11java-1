package ListaLacosDecisaoJava;

import java.util.Scanner;

public class ex4 {
	
	Scanner tec = new Scanner(System.in);
	int num = 0; 
	double raiz =0;
	int potencia = 0;
		
	
	System.out.print("Digite um número: ");
	num = tec.nextInt();
	
	if(num % 2 == 0) {
		raiz =(int) Math.sqrt(num);
		System.out.printf("Número %d é par e sua raiz é %.2f",num,raiz);
	}
	else if(num % 2 == 1) {
		potencia = num * num;
		System.out.printf("Número %d é ímpar e sua potencia é %d",num,potencia);
	}
	else {
		System.out.println("Número negativo ou zero");

	}
}

}