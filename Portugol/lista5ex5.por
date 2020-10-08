

programa
{
	  
/*
 * 
 * Faça um programa que leia um vetor de 5 posições para números reais e, depois, um código inteiro. 
 * Se o código for zero, finalize o programa; 
 * se for 1, mostre o vetor na ordem direta; 
 * se for 2, mostre o vetor na ordem inversa. 
 * Caso, o código for diferente de 1 e 2, 
 * escreva uma mensagem informando que o código inválido.
 * 
 * 
 */

	funcao inicio()
	{
		const inteiro TAMANHO = 5
		real vetorNum [TAMANHO]
		inteiro codigo = 0

		para(inteiro x =0; x < 5; x++)
		{
			escreva("\nDigite um número para o vetor: ")
			leia(vetorNum[x])
		}

		escreva("\nDigite um código de 0 a 2: ")
		leia(codigo)

		se(codigo !=0 e codigo !=1 e codigo !=2)
		{
			escreva("Você digitou um código inválido!")
			
		}senao se(codigo ==1)
		{
			escreva("\nLendo o vetor na ordem direta ...")
			para(inteiro y =0; y< TAMANHO; y++)
			{
				escreva("\n", vetorNum[y])
			}
		}senao se(codigo == 2)
		{
			escreva("\nLendo o vetor na ordem inversa...")
			para(inteiro y = TAMANHO - 1; y >= 0 ; y--)
			{
				escreva("\n",vetorNum[y])
			}
		} senao
		{
				
		}
		


		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 379; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */