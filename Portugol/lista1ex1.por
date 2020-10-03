programa
{
	
	funcao inicio()
	{
		/*
		 * 1. Faça um sistema que leia a idade de uma pessoa expressa em anos, 
		 * meses e dias e mostre-a expressa apenas em dias. 
		 */
		 
		 //ingredientes-variaveis
		 
		 inteiro anos
		 inteiro meses
		 inteiro dias
		 inteiro totalDias=0
		 
		 //modo de preparo
		escreva("/n Digite os anos : ")
		leia(anos)
		escreva("/n Digite os meses: ")
		leia (meses)
		escreva("/n digite os dias: ")
		leia(dias)
	
		totalDias=((anos*365)+(meses*30)+1)

		//saída
		escreva("Total de dias é: ", totalDias)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 416; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */