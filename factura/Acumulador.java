package factura;

public class Acumulador implements Modificacion {
    
    // Atributos
    private int valor;

    // Métodos get y set
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    // Constructor
    public Acumulador(int valor) {
        this.valor = valor;
    }

    // Métodos de la clase
    public void incremento(int cantidad) {
        this.valor += cantidad;
    }
}
