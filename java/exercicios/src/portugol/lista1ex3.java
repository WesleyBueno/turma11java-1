package portugol;

import java.util.Scanner;

public class lista1ex3 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);	
		
		int totalSegundos;
		int tempoHoras=0 ;
		int tempoMinutos=0 ;
		int tempoSegundos=0 ;
		int restoHoras=0 ;
		int restoMinutos=0;
		
		 System.out.printf("Iforme o tempo total em segundos:  ");
		 totalSegundos= tec.nextInt();
		 
		 
		 restoHoras= (totalSegundos/3600);
		 
		 tempoHoras=((totalSegundos-restoHoras)/3600);
		 restoMinutos=(restoHoras%60);
		 tempoMinutos=((restoHoras-restoMinutos)/60);
		 tempoSegundos=restoMinutos;
		 
		 System.out.printf("O tempo em total é de: %d horas  %d minutos  %d segundos ", tempoHoras ,tempoMinutos, tempoSegundos);
		 
		 tec.close();
		 
	
	}

}
