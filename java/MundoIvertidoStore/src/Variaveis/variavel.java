package Variaveis;

import java.util.Scanner;

public class variavel {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		String produtos[] = { "CAMISETA BRANCA", "CAMISETA PRETA", "CAMISETA AZUL", "CAMISETA VERMELHA", "CALÇA JEANS",
				"CALÇA PRETA", "VESTIDO BRANCO", "VESTIDO PRETO", "MOLETOM", "BOLSA" };

		String codigos[] = { "1B", "1P", "1A", "1V", "2J", "2P", "3B", "3P", "4M", "5B" };
		int quantidadesEstoque[] = { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 };
		double precos[] = { 40, 40, 40, 40, 90, 90, 120, 120, 120, 90 };
		String nomeUsuario, codigoP;
		char identidade;
		char opc='S', opcao = 'S', opcAlterar = 'S', fim='N';
		int x = 0, y = 0, indice = 0, unidade = 0, opp=0, parcelas=0;
		int quantidadeCarrinho[] = new int[10];
		double subtotal = 0;
		boolean compCodigo = false;
		do {
		System.out.println("Para entrar Identifique-se:");

		System.out.print("Qual seu nome?!: ");
		nomeUsuario = tec.next();
		System.out.print("Como você se identifica?!: ");
		identidade = tec.next().charAt(0);
		System.out.println("Sejam Bem Vindes!!!");
		do {
			do {

				ListaProdutos(codigos, produtos, quantidadesEstoque, precos);

				System.out.print("Digite o código do produto: ");
				codigoP = tec.next().toUpperCase();
				testeCodigo(codigoP, codigos, compCodigo);

				for (x = 0; x < precos.length; x++) {
					if (codigos[x].equals(codigoP)) {
						indice = x;

					}
				}
				System.out.println(produtos[indice] + "    R$ " + precos[indice] + "   Quantidade disponível: "
						+ quantidadesEstoque[indice] + " Unidades");

				System.out.print("Quantas unidades você deseja: ");
				unidade = tec.nextInt();

				while (unidade > quantidadesEstoque[indice]) {
					System.out.println("Quantidade Insuficiente");
					System.out.print("Quantas unidades você deseja: ");
					unidade = tec.nextInt();
				}

				quantidadesEstoque[indice] = (quantidadesEstoque[indice] - unidade);

				ListaProdutos(codigos, produtos, quantidadesEstoque, precos);

				quantidadeCarrinho[indice] = (quantidadeCarrinho[indice] + unidade);
				carrinho(codigos, produtos, quantidadeCarrinho, precos);

				subtotal = subTotal(quantidadeCarrinho, precos, unidade, subtotal);

				System.out.printf("Subtotal: R$ %.2f ", subtotal);
				System.out.println();

				System.out.print("Deseja Continuar comprando?!: S-sim  N-não  ");
				opc = tec.next().toUpperCase().charAt(0);
			} while (opc == 'S');

			limpa();
			carrinho(codigos, produtos, quantidadeCarrinho, precos);
			System.out.printf("Subtotal: R$ %.2f ", subtotal);
			System.out.println();

			System.out.print("Deseja alterar o carrinho?!: S-sim  N-não  ");
			opcao = tec.next().toUpperCase().charAt(0);
			while (opcAlterar == 'S') {

				if (opcao == 'S') {
					limpa();
					carrinho(codigos, produtos, quantidadeCarrinho, precos);
					System.out.printf("Subtotal: R$ %.2f ", subtotal);
					System.out.println();

					System.out.print("Digite o código do produto que você deseja alterar: ");
					codigoP = tec.next().toUpperCase();
					testeCodigo(codigoP, codigos, compCodigo);
					for (x = 0; x < precos.length; x++) {
						if (codigos[x].equals(codigoP)) {
							indice = x;

						}
					}
					System.out.println(produtos[indice] + "    R$ " + precos[indice] + "   Quantidade escolhida: "
							+ quantidadeCarrinho[indice] + " Unidades");

					System.out.print("Quantas unidades você deseja remover: ");
					unidade = tec.nextInt();
					while (unidade > quantidadeCarrinho[indice]) {
						System.out.println("Quantidade Excedente!");
						System.out.print("Quantas unidades você deseja remover: ");
						unidade = tec.nextInt();
					}

					quantidadesEstoque[indice] = (quantidadesEstoque[indice] + unidade);
					quantidadeCarrinho[indice] = (quantidadeCarrinho[indice] - unidade);
					carrinho(codigos, produtos, quantidadeCarrinho, precos);

					subtotal = subTotal(quantidadeCarrinho, precos, unidade, subtotal);

					System.out.printf("Subtotal: R$ %.2f ", subtotal);
					System.out.println();
				}
				System.out.print("Deseja fazer uma nova alteração no carrinho?! S-sim N-não ");
				opcAlterar=tec.next().toUpperCase().charAt(0);	
			}
			System.out.print("Escolha a forma de Pagamento: 1-A vista com 10% de desconto \n2-Crédito (1-3x sem juros) ");
			opp=tec.nextInt();
			while(opp>2) {
				System.out.println("Dados Incorretos! Digite uma opção Válida!");
				System.out.print("Escolha a forma de Pagamento: 1-A vista com 10% de desconto \n2-Crédito (1-3x sem juros) ");
				opp=tec.nextInt();
			}
			if (opp == 1){
				System.out.println("\n\nOpção escolhida: R$"+ (subtotal - (subtotal / 100 * 10) )+ ".\n");
				subtotal=(subtotal - (subtotal / 100 * 10) );
			}
			else if (opp == 2){
				System.out.print("Digite a opção de parcelas desejada: 1, 2 ou 3 ");
				parcelas=tec.nextInt();
				while(parcelas>3) {
				System.out.println("Dados Incorretos! Digite uma Parcela Válida!");
				parcelas=tec.nextInt();
				}
				if ( parcelas == 1) {
					System.out.println("R$ " + subtotal + " em uma vez.");
				}
				if ( parcelas == 2) {
					System.out.println("Em duas vezes de R$ " + subtotal/2 + " sem juros.");
				}
				if ( parcelas == 3) {
					System.out.println("Em três vezes de R$ " + subtotal/3 + " sem juros.");
				}
			
			}
			
		} while (opcao == 'S');
		System.out.println("Parabéns pela sua Compra "+ nomeUsuario + "!");
		
		System.out.println();
		
		System.out.println("NOTA FISCAL");
		carrinho(codigos, produtos, quantidadeCarrinho, precos);
		System.out.println("Total: R$ " + subtotal);
		System.out.printf("Valor de Icms incidente sobre a compra: R$ %.2f" , ((subtotal/100)*9));
		
		System.out.print("\nNovo Cliente?!: S-sim N-não ");
		fim= tec.next().toUpperCase().charAt(0);
		
		opc='S';
		opcao = 'S';
		opcAlterar = 'S'; 
		indice = 0; 
		unidade = 0; 
		opp=0; 
		parcelas=0;
		for (int i = 0; i < quantidadeCarrinho.length; i++) {
			quantidadeCarrinho[i]=0;
		}
		subtotal = 0;
		compCodigo = false;
		
		}while(fim=='S');
		tec.close();
		

	} // LISTA DE PRODUTOS

	public static void ListaProdutos(String codigos[], String produtos[], int quantidadesEstoque[], double precos[]) {
		System.out.println("Lista de Produtos");

		for (int x = 0; x < precos.length; x++) {
			System.out.printf("\t %s \t %s \t %d \t %.2f \n", codigos[x], produtos[x], quantidadesEstoque[x],
					precos[x]);

		}

	}// CARRINHO

	public static void carrinho(String codigos[], String produtos[], int quantidadeCarrinho[], double precos[]) {
		System.out.println("Seu Carrinho:");
		for (int x = 0; x < precos.length; x++) {
			if (quantidadeCarrinho[x] != 0)
				System.out.printf("\t %s \t %s \t %d \t %.2f \n", codigos[x], produtos[x], quantidadeCarrinho[x],
						precos[x]);

		}
	}// SUBTOTAL

	public static double subTotal(int quantidadeCarrinho[], double precos[], int unidade, double subtotal) {

		for (int x = 0; x < precos.length; x++) {

			if ((quantidadeCarrinho[x] != 0) && (quantidadeCarrinho[x] == unidade)) {
				subtotal = subtotal + (quantidadeCarrinho[x] * precos[x]); // subtotal somando unidades iguais-resolução
																			// var aux
			}

		}
		return subtotal;
	}

	// TESTE CODIGO- erro código carrinho
	public static void testeCodigo(String codigoP, String codigos[], boolean compCodigo) {
		Scanner tec = new Scanner(System.in);
		while (compCodigo == false) {

			for (int x = 0; x < codigos.length; x++) {
				if (codigos[x].equals(codigoP)) {
					compCodigo = true;
				}
			}
			if (compCodigo == false) {
				System.out.println("Código inválido,tente novamente!!");
				codigoP = tec.next().toUpperCase();
			} else if (compCodigo == true) {

			}
		}
	}

	public static void limpa() {
		for (int i = 0; i < 50; i++) {
			System.out.println();

		}
	}

}
