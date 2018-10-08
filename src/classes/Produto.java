package classes;

/**
 * 04/10/18
 * @author Kátia Marina
 */

public class Produto {

	static int codigo_produto;
	static String tipo_produto;
	static float valorUnitario;

	public int getCodigo_produto() {
		return codigo_produto;
	}

	public void setCodigo_produto(int codigo_produto) {
		Produto.codigo_produto = codigo_produto;
	}

	public static String getTipo_produto() {
		return tipo_produto;
	}

	public void setTipo_produto(String tipo_produto) {
		Produto.tipo_produto = tipo_produto;
	}

	public float getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(float valorUnitario) {
		Produto.valorUnitario = valorUnitario;
	}

}
