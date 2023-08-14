package comparable;

public class Numero implements Comparable {
    // Atributo
    private int valor;

    // Métodos get y set
    public int getValor() {
        return valor;
    }

    public void setValor(valor) {
	this.valor = valor;
    }

    // Constructor
    public Numero(valor) {
        this.valor = valor;
    }

    // Métodos de la clase
    public int esMayor(Comparable num) {
        if (this.valor > num.getValor()) {
	    return 1;
	} else if (this.valor < num.getValor()) {
	    return -1;
	} else {
	    return 0;
	}
    }
}    		
