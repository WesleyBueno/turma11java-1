package ListaLacosRepeticao;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		
		/*
		 *  idade, sexo (1-feminino / 2-masculino / 3-Outros), 
		 *  e as opções (1, se a pessoa era calma; 
		 *  2, se a pessoa era nervosa e
		 *   3, se a pessoa era agressiva).
		 *   o número de pessoas calmas; 
	o número de mulheres nervosas; 
	o número de homens agressivos; 
	o número de outros calmos;
	o número de pessoas nervosas com mais de 40 anos; 
	o número de pessoas calmas com menos de 18 anos.

		 */
		//criando um teclado
		Scanner tec = new Scanner(System.in);
		
	//declarar as variaveis
		int idade;
		final int LIMITE=1;
		byte sexo;
		byte tipoHumor;
		int  pessoasCalmas=0, mulheresNervosas=0, homensAgressivos=0, outrosCalmos=0, pessoasNervosasAcima40Anos=0, calmasMenor18=0;
		
		int contador=0;
		System.out.println("--------------------SISTEMA DE PESQUISA-------------------");
		while (contador<=LIMITE) {
			System.out.print("Digite a sua idade");
			idade= tec.nextInt();
			System.out.println("Digite (1-feminino / 2-masculino / 3-Outros)");
			sexo=tec.nextByte();
			System.out.print("Digite seu tipo de pessoa:  1-calma 2- nervosa 3- agressiva");
			tipoHumor=tec.nextByte();
			
			tec.nextLine(); //limpeza de buffer(memória);
			
			if(tipoHumor==1) {
				
				pessoasCalmas=(pessoasCalmas+1);
			}
			
			if((tipoHumor==2) && (sexo==1)) {
			mulheresNervosas= (mulheresNervosas+1);
			}
			
			
			if((tipoHumor==3)&& (sexo==2)) {
				homensAgressivos=(homensAgressivos+1);
			}
			
			if((tipoHumor==1)&&(sexo==3)) {
				outrosCalmos=(outrosCalmos+1);	
			}
			
			if((idade>=40) && (tipoHumor==2)) {
				pessoasNervosasAcima40Anos=(pessoasNervosasAcima40Anos+1);
				
			}
			if ((idade<18) && (tipoHumor==1)){
				calmasMenor18=(calmasMenor18+1);
			}
			
			
			//fuga do loop/laço
			contador++;
			
			
			
		}
		
		
		
		System.out.printf("\nTotal de Pessoas Calmas: %d, ", pessoasCalmas);
		System.out.printf("\nTotal de Mulheres Nervosas: %d, ", mulheresNervosas);
		System.out.printf("\nTotal de Homens Agressivos: %d, ", homensAgressivos);
		System.out.printf("\nTotal de Outros Calmos: %d, ", outrosCalmos);
		System.out.printf("\nTotal de Pessoas Nervosas Acima dos 40 anos: %d, ", pessoasNervosasAcima40Anos);
		System.out.printf("\nTotal de Pessoas Calmas Abaixo dos 18: %d", calmasMenor18);
		
		
		
		
		tec.close();
		
		
	}

}
