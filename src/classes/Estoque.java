package classes;

public class Estoque {

	static Produto produto;
	static int quantidade_produto;

	public static void cadastraProduto(int codigo_produto, String tipo_produto, int quantidade_produto,
			float valorUnitario) {
		produto.setCodigo_produto(codigo_produto);
		produto.setTipo_produto(tipo_produto);
		setQuantidade_produto(quantidade_produto);
		produto.setValorUnitario(valorUnitario);
	}

	public static void atualizaEstoqueProduto(int codigo_produto, int quantidade_produto) {
		setQuantidade_produto(quantidade_produto);
	}

	public static boolean temEstoque(int codigo_produto, int quantidade_produto_carrinho) {
		if (quantidade_produto > quantidade_produto_carrinho)
			return false;
		else
			return true;
	}

	public static void removeProduto(int codigo_produto) {
		produto.setCodigo_produto(0);
		produto.setTipo_produto("");
		setQuantidade_produto(0);
		produto.setValorUnitario(0);

	}

	
	
	public static int getQuantidade_produto() {
		return quantidade_produto;
	}

	public static void setQuantidade_produto(int quantidade_produto) {
		Estoque.quantidade_produto = quantidade_produto;
	}

}
