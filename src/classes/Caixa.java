package classes;

public class Caixa {
	private Pagamento pagamento;
	private Produto produto;
	private Funcionario atende;

	public void ItemCompra(int codigo_produto) {
		this.produto.codigo_produto = codigo_produto;
		this.pagamento = new Pagamento();
		this.produto = new Produto();
		this.atende.quantidade_produto_carrinho = 0;
		this.produto.valorUnitario = (float) 0.0;
	}

}