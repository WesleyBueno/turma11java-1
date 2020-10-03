programa
{
	
	funcao inicio()
	{
	/*
	 * 2. Faça um sistema que leia a idade de uma pessoa expressa em dias 
	 * e mostre-a expressa em anos, meses e dias.
	 */
	 
	 //variaveis

	 //a=anos, m=meses, d=dias 
	 inteiro a, m , d, dias
	 	dias=0
		a=0
		m=0
		d=0
		
	 

	 //processamento

	 escreva("\n Quantos dias de vida você tem?! ", dias )
	 leia (dias)

	 	a=(dias/365)
		m=(dias%365)/30
		d=(dias%365)%30)

		//saida
		
		escreva("Você tem ",a, " ano(s) ",m, " mês(s) ",d, " dia(s)! ")
	 

	 
	 

	 
	 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 299; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */