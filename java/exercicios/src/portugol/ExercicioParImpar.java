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
				System.out.print("O valor � positivo e par.");
			}
			else {
				System.out.print("O valor � positivo e �mpar.");
			}
		}
		if (valorUsuario <0) {
			if((valorUsuario % 2==0)) {
				System.out.print("O valor � negativo e par.");
			}
			else {
				System.out.print("O valor � negativo e �mpar.");
			}
		}
		else if (valorUsuario == 0){
			System.out.print("Voc� digitou 0.");

	}

}
}
