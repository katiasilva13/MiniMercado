package classes;

/**
 * 07/10/18
 * @author Daniela Viviane
 */

public class Forma_de_Pagamento {
	  int tipo;
	    public final int DINHEIRO = 1;
	    public final int CREDITO = 2;
	    public final int DEBITO = 3;
	    public final int CHEQUE = 4;
	    
	    
	   public void FormadePagamento(int tipo) {
	        this.tipo = tipo;
	    }
	   public int getTipo() {
	        return tipo;
	    }
	    public void setTipo(int tipo) {
	        this.tipo = tipo;
	    }

}
