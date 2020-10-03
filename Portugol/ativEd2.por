programa
{
	
	funcao inicio()
	{
		//receber do usuario o nome e mandar uma mensagem de bom dia
		//colocando sr ou sra conforme a opção
//variaveis
		cadeia nomeUsuario
		caracter opcao
		
		escreva("\n Digite seu nome: ")
		leia (nomeUsuario)
		escreva("\n Digite M-masculino ou F-feminino: ")
		leia(opcao)
		se(opcao=='F')
		{ escreva("\n Oi Senhora ",nomeUsuario )}
		senao se (opcao=='M') 
		{escreva("\n oi Senhor ", nomeUsuario)
			}
		senao{
			escreva("\n Oi, Senhor ", nomeUsuario)
		}

		senao{
			escreva("\n Oi SenhorX, ", nomeUsuario) }
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 522; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */