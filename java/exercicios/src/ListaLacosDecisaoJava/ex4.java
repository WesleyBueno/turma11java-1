package ListaLacosDecisaoJava;
import java.util.Scanner;

public class ex4 {
	
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		int num = 0; 
		double raiz =0;
		int potencia = 0;
				
		System.out.print("Digite um numero: ");
		num = tec.nextInt();
		
		if(num % 2 == 0) {
			raiz =(int) Math.sqrt(num);
			System.out.printf("N�mero %d � par e sua raiz � %.2f",num,raiz);
		}
		else if(num % 2 == 1) {
			potencia = num * num;
			System.out.printf("N�mero %d � �mpar e sua potencia � %d",num,potencia);
		}
		else {
			System.out.println("N�mero negativo ou zero");
		}
	
		tec.close();
	}
}