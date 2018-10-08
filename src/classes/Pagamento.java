package classes;

/**
 * 07/10/18 
 * * @author Daniela Viviane & Kátia Marina
 */

public class Pagamento {

	private float valorRecebido;
	private float valorTotal = 0;
	private float troco;
	private int tipo = 0;

	public float calcularValorTotal() {
		valorTotal = valorTotal + 0; //TODO editar, ta incompleto
		return valorTotal;
	}

	public Pagamento() {

		if (tipo == 1 || tipo == 2 || tipo == 3 || tipo == 4) {
			setTroco(valorRecebido - valorTotal);
		} else
			System.out.println("Forma de pagamento inválida");
	}

	public float getValorRecebido() {
		return valorRecebido;
	}

	public void setValorRecebido(float valorRecebido) {
		this.valorRecebido = valorRecebido;
	}

	public float getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(float valorTotal) {
		this.valorTotal = valorTotal;
	}

	public float getTroco() {
		return troco;
	}

	public void setTroco(float troco) {
		this.troco = troco;
	}

}