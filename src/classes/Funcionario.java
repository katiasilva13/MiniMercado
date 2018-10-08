package classes;

import java.util.Scanner;

/**
 * 07/10/18 
 * @author K�tia Marina
 */

public class Funcionario {

	static Produto produto;
	static Pagamento pag;

	static Scanner scan = new Scanner(System.in);

	static int quantidade_produto_carrinho;
	static float valorCompra = 0;

	
	public static boolean confirmar() { //talvez seja in�til, depende de como ser� utilizado
		String confirma = scan.nextLine(); //os m�todos que usam esse m�todo
		if ("N".equals(confirma)) {
			return false;
		} 
		return true;
	}
	
	
	public static boolean iniciaVenda() {
		System.out.println("Iniciar venda?\n(Sim = Y; N�o = N)");
		String confirma = scan.nextLine();
		if ("N".equals(confirma)) {
			return false;
		} 
		return true;
	}

	public static void cancelaVenda() {
		System.out.println("Cancelar venda?\n(Sim = Y; N�o = N)");
		confirmar();
	}
	
	
	public static void addProduto(int codigo_produto, int quantidade_produto_carrinho) {
		float valorUnidade = produto.getValorUnitario();
		int quanti = getQuantidade_produto_carrinho();
		valorCompra = valorCompra + (valorUnidade * quanti);
	}




	public static void removeProduto() {
		//TODO fazer o m�todo
	}

	public static void iniciaPagamento() {
		System.out.println("Iniciar pagamento?\n(Sim = Y; N�o = N)");
		confirmar();
	}

	public static void confirmaPagamento() {
		System.out.println("Comfirmar pagamento?\n(Sim = Y; N�o = N)");
		confirmar();
	}

	public static void emiteNotaFiscal() {
		//TODO fazer o m�todo
	}
	
	
	
	public static int getQuantidade_produto_carrinho() {
		return quantidade_produto_carrinho;
	}

	public static void setQuantidade_produto_carrinho(int quantidade_produto_carrinho) {
		Funcionario.quantidade_produto_carrinho = quantidade_produto_carrinho;
	}

	
	public static void main(String[] args) {
		iniciaVenda();
		if (iniciaVenda()) {
			addProduto(produto.codigo_produto, quantidade_produto_carrinho);
		}
		//TODO incompleto
	}

}
