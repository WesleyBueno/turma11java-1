package ListaLacosRepeticao;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
		Scanner tec= new Scanner(System.in);
		
		int num=0 , numPar=0, numImpar=0, contador=0;
		
		
		for(contador=1; contador<=10; contador++) {
			System.out.print("Digite um número: ");
			num= tec.nextInt();
			if((num%2)==0) {
				numPar+=1;
			}else {
				numImpar+=1;
				
				
			
			}
			tec.close();	
		}
		System.out.println();
		System.out.printf("%d numeros são Pares",numPar);
		System.out.println();
		System.out.printf("%d numeros são Ímpares",numImpar);
		
		
	}

}
