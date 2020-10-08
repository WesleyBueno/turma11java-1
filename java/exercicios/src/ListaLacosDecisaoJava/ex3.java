package ListaLacosDecisaoJava;

import java.util.Scanner;

public class ex3 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		int num = 0;
		System.out.print("Digite sua idade: ");
		num = tec.nextInt();
		
		if(num >= 10 && num <= 14) {
			System.out.println("Infantil");
		}
		else if (num >=15 && num <= 17) {
			System.out.println("Juvenil");
		}
		else if(num >= 18 && num <= 25) {
			System.out.println("Adulto");
		}
		else {
			System.out.println("Número fora da tabela");
			
			tec.close();

}
	}
}
