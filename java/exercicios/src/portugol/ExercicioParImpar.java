package portugol;

import java.util.Scanner;

public class ExercicioParImpar {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		int valorUsuario;
		
		System.out.print("Digite um valor: ");
		valorUsuario = tec.nextInt();
		
		if (valorUsuario > 0) {
			if ((valorUsuario %2) == 0) {
				System.out.print("O valor é positivo e par.");
			}
			else {
				System.out.print("O valor é positivo e ímpar.");
			}
		}
		if (valorUsuario <0) {
			if((valorUsuario % 2==0)) {
				System.out.print("O valor é negativo e par.");
			}
			else {
				System.out.print("O valor é negativo e ímpar.");
			}
		}
		else if (valorUsuario == 0){
			System.out.print("Você digitou 0.");

	}

}
}
