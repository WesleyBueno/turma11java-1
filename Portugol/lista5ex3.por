
programa
{
	
	funcao inicio()
	{ 
		0/*
 * Escrever um programa que leia uma quantidade desconhecida de números e conte quantos deles estão nos seguintes intervalos: 
 * [0-25], [26-50], [51-75] e [76-100]. 
 * A entrada de dados deve terminar quando for lido um número negativo.
 * 
 */


		inteiro numero = 0
		inteiro grupo1 = 0 // Grupo de números nesse intervalo [0-25]
		inteiro grupo2 = 0 // Grupo de números nesse intervalo [26-50]
		inteiro grupo3 = 0 // Grupo de números nesse intervalo [51-75]
		inteiro grupo4 = 0 // Grupo de números nesse intervalo [76-100]
		

		enquanto(numero >= 0)
		{
			escreva("\nDigite um número positivo ou ")  
			escreva(" para sair digite um número negativo: ")
			leia(numero)

			se(numero <=25)
			{
				grupo1 ++
			}senao se(numero <= 50)
			{
				grupo2++
			}senao se(numero <= 75)
			{
				grupo3++
			}senao se(numero <= 100)
			{
				grupo4++
			}
			
		}

		escreva("\nA quantidade de números entre [0 - 25] é de: ", grupo1)
		escreva("\nA quantidade de números entre [26 - 50] é de: ", grupo2)
		escreva("\nA quantidade de números entre [51 - 75] é de: ", grupo3)
		escreva("\nA quantidade de números entre [76 - 100] é de: ", grupo4)

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 38; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */