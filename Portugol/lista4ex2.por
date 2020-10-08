
programa
{ /*
 * Um dado é lançado 10 vezes e o valor correspondente é anotado. 
 * Faça um programa que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e imprima a média aritmética dos lançamentos, 
 * contabilize e apresente também quantas foram as ocorrências da maior pontuação.
 */


	inclua biblioteca Util
		funcao inicio()
	{
		const inteiro LIMITE = 10// o tamanho da vetor
		inteiro valoresDado[LIMITE] //declarando a vetor
		inteiro maiorNumero = 0
		inteiro soma=0, media=0, ocorrenciaMaiorPontuacao = 0
		
		escreva("Sorteando valores")
		pula()
		
		para (inteiro x = 0 ; x < LIMITE; x++) 
		{
			//Aqui estou soreteando um número e colocando ele na posição , acada vez que o para rodar ele vai sortear mais um número e vai colocar na próxima posição até acabar o "para"
			valoresDado[x] = Util.sorteia(1, 6)
			//Nesse "se" eu comparo cada número com o que tem dentro da variável maiorNumero , sempre que o número inserido no vetor for maior do que aquele que está guardado na variável maiorNúmero, ele será colocado na variável maiorNúmero 
			se(valoresDado[x] > maiorNumero)
			{
				maiorNumero = valoresDado[x]
			}
			// aqui eu tô colocando cada valor na variável soma, somando com o que já foi guardado na variável soma
			soma = soma + valoresDado[x]
			escreva("O lançamento ",(x+1), " foi ",valoresDado[x])
			pula()
		}
		
//Nesse para eu estou olhando para cada elemento inserido na matriza e comparando com o maiorNumero pra saber quantas vezes ele aparece
		para (inteiro x = 0; x < LIMITE; x++)
		{
			se (valoresDado[x] == maiorNumero)
			{
				ocorrenciaMaiorPontuacao ++
			}
		}
		
		//Saída
		
		escreva("A média aritmética é de: " + (soma/LIMITE))
		pula()
		escreva("O maior lançamento foi: " + maiorNumero )
		pula()
		escreva("A frequência do maior lançamento foi de: " +ocorrenciaMaiorPontuacao+" vezes")
		pula()
		
		
	}
	funcao pula(){
		escreva("\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 314; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */