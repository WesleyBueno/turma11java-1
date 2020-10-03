programa
{
	
	funcao inicio()
	{
		/*
		 * 4) Faça um sistema que leia um número inteiro e mostre 
		 * uma mensagem indicando se este número é par ou ímpar, e se é 
		 * positivo ou negativo.
		 * sero é neutro
		 * par ou impar só para positivo
		 * negativo menor que 0
		 * variavel- numero inteiro
		 * 
		 */

		 //variavel
		 inteiro valorUsuario

		 escreva("\n Digite um valor: ")
		 leia(valorUsuario)

		//Processamento e saída
		se(valorUsuario< 0)
		{
			escreva("\n O número digitado é: ", valorUsuario) 
			escreva("! Este é um número negativo! Não há par ou ímpar entre os números negativos")

			} 
			senao se(valorUsuario == 0)
			{

			escreva("\n O número digitado é: ", valorUsuario) 
			escreva("\n Este é um número neutro!")

				}
				senao
			{

				se(valorUsuario % 2 ==0)
				{

					escreva("O número digitado é: "+ valorUsuario + "!Este é um número positivo e par!")

					}
				senao
					{

					escreva("\n O número digitado é: ", valorUsuario) 
					escreva("\n Este é um número positivo e ímpar!")
    
	
		
	}
	
} 
	}

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 354; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */