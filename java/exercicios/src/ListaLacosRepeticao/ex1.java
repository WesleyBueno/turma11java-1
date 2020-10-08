package ListaLacosRepeticao;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		// Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos resto = 5. (FOR)
		Scanner tec = new Scanner(System.in);
		for (int i=1000; i < 2000; i++){
		    if (i%11==5) {
		      System.out.println(i);
		    }
		
		tec.close();
	
		    
		}

	

}
}

