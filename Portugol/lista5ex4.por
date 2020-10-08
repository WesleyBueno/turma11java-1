
programa
{
	
	funcao inicio()
	{
		/*
 * 
 * Faça um programa que calcula e escreve a seguinte soma: soma = 1/1 + 3/2 + 5/3 + 7/4 + ... + 99/50
 * 
 */

		inteiro numCima=1 , numBaixo = 1, soma =0

		faca{
			soma = soma + numCima/numBaixo
			numCima = numCima + 2
			numBaixo ++
			escreva("\n",numCima,"\n")
			escreva("\n",numBaixo,"\n")
			
		}enquanto(numCima <= 99 e numBaixo <=50)

		escreva("A soma dos números 1/1 + 3/2 + 5/3 + 7/4 + ... + 99/50 é : " , soma)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 36; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */