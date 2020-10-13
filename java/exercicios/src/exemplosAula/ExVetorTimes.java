package exemplosAula;

import java.util.Scanner;

public class ExVetorTimes {

	public static void main(String[] args) {
		/*
		 * VETOR COM OS 4 TIMES DE SÃO PAULO
CORINTHIANS
PALMEIRAS
SPFC
SANTOS
GANHA - 3 PONTOS
EMPATA - 1 PONTO
PERDE - 0 PONTO
PRIMEIRA RODADA
CADA TIME SE GANHOU, PERDEU OU EMPATOU
MOSTRA A PONTUAÇÃO DA PRIMEIRA RODADA
SEGUNDA RODADA
RESULTADOS JÁ COM A SEGUNDA RODADA
TERCEIRA RODADA - MESMA COISA
		 */
		
		Scanner tec= new Scanner(System.in);
		// variaveis
		
		String times[]= {"corinthians", "palmeiras","spfc", "santos"};
		int pontos[]= {0,0,0,0};
		char resultado; //1 ganhou 2 empate 3 derrota
		char opc='s';
		
		
		// momento inicial
		System.out.println("\nAntes dos Jogos");
		for(int x=0; x < times.length; x++) {
			System.out.printf("\nEquipe-%s Pontos: %d", times[x], pontos[x]);
			
		}
		//uma rodada
		System.out.println("Processo de Rodadas");
		while(opc=='S') 
		syso{
		for(int x=0; x < times.length; x++) {
			System.out.printf("\nEquipe- %s Digite G-ganhou, E- empatou P-perdeu: ", times[x]);
			resultado= tec.next().toUpperCase().charAt(0);
			 if(resultado=='G') {
				 pontos[x]=pontos[x]+3;
			 }else if (resultado=='E') {
				 pontos[x]=pontos[x]+1;
			 }else if (resultado=='P') {
				 pontos[x]= pontos[x]+0;
			 }
			 
		}
		}
		System.out.println("Continua sim ou não: ");
		opc= tec.next().toUpperCase()
		System.out.println("Resultado apos rodada");
		for(int x=0; x < times.length; x++) {
			System.out.printf("\nEquipe-%s Pontos: %d", times[x], pontos[x]);
			
		}
		
		
		
		
		tec.close();
		

	}

}
