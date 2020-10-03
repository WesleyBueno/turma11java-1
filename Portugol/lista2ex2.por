programa
{
	
	funcao inicio()
	{
		/*
 		* Elabore um sistema que leia as variáveis C e N, respectivamente código e número de horas trabalhadas de um operário. 
 		* E calcule o salário sabendo-se que ele ganha R$ 10,00 por hora. 
 		*Quando o número de horas exceder a 50 calcule o excesso 
 		*de pagamento armazenando-o na variável E, 
 		* caso contrário zerar tal variável. 
 		*A hora excedente de trabalho vale R$ 20,00. 
 		* No final do processamento imprimir o salário total e o salário excedente.
 */
 
 //variáveis

		inteiro C = 0, valorHora = 10, valorHoraExcesso = 20
		real pagamento = 0, salarioTotal = 0, E = 0, N = 0  
		

		escreva("\n Digite a quantidade de horas de trabalho: ")
		leia(N)
		escreva("\n Digite o número do código: ")
		leia(C)


		//Processamento
		salarioTotal = 50 *valorHora

		se(N > 50)
		{
			E = (N -50)*valorHoraExcesso 
			}

			pagamento = salarioTotal + E
			
		//Saída
		escreva("\n O empresário de código: ", C) 
		escreva("\n Trabalhou  ", N, " horas") 
		escreva("\n O sálario total regular é de: ", salarioTotal)
		escreva("\n O pagamento do excedente de trabalho foi de: ", E)
		escreva("\n O pagamento final foi de: ", pagamento)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 996; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */