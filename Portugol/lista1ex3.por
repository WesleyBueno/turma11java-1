programa
{
	
	funcao inicio()
	{
		/*
		 * 3. Faça um sistema que leia o tempo de duração de um evento 
		 * em uma fábrica expressa em segundos e mostre-o expresso em 
		 * horas, minutos e segundos. 
		 */

		 //variaveis
		 inteiro tempoDuracao=0
		 inteiro horas=0
		 inteiro minutos=0
		 inteiro segundos=0

		//processamento
		
		escreva("Digite o tempo em segundos: ")
		leia (tempoDuracao)
		horas=tempoDuracao/3600
		
		escreva("\nTotal de horas: ", horas)
		minutos=(tempoDuracao%3600)/60
		
		escreva("\nTotal de minutos: ", minutos)
		segundos=(tempoDuracao%3600)%60

	//saida
		escreva("\nTotal de Segundos: ", segundos)
		
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 289; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */