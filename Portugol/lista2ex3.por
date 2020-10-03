programa
{
	
	funcao inicio()
	{
		/*
		 * 3) Desenvolva um sistema em que:
Leia 4 (quatro) números;
Calcule o quadrado de cada um;
Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
Caso contrário, imprima os valores lidos e seus respectivos quadrados.
	preciso de 4 variaveis
	variavel* variavel
		 *preciso de mais 4 variaveis pro codigo		 
		 *refatoracao de codigo
		 *variavel 3* for maior ou igual a mil imprima-o
		 *se nao for imprima valor1,valor2,valor4 e valor1*1 (até o 4)
		 *
		  */

		  //variaveis
		  inteiro valor1
		  inteiro valor2
		  inteiro valor3
		  inteiro valor4
		  inteiro quadrado1=0
		  inteiro quadrado2=0
		  inteiro quadrado3=0
		  inteiro quadrado4=0

		  escreva("Digite o valor 1: ")
		  leia(valor1)
		  escreva("Digite o valor 2: ")
		  leia(valor2)
		  escreva("Digite o valor 3: ")
		  leia(valor3)
		  escreva("Digite o valor 4: ")
		  leia(valor4)

		  //calculo

		  quadrado1= valor1*valor1
		  quadrado2= valor2*valor2
		  quadrado3= valor3*valor3
		  quadrado4= valor4*valor4

		  se(quadrado3>= 1000)
		  {
		  	escreva("O valor do 3 numero é ", " e seu quadrado é ", quadrado3)
		  }
		  
		  senao 
		  {
		  
		  	escreva("\n Valor 1 ", valor1) escreva("\n seu quadrado é ", quadrado1)
		  	escreva("\n Valor 2 ", valor2) escreva("\n seu quadrado é ", quadrado2)
		  	escreva("\n Valor 3 ", valor3) escreva("\n seu quadrado é ", quadrado3)
		  	escreva("\n Valor 4 ", valor4) escreva("\n seu quadrado é ", quadrado4)
		  }
		 
		 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 0; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */