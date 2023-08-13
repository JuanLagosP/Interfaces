package factura;

public class Factura implements Constantes, Variaciones {
    // Atributos
    private double totalSinIVA;
    public final static double IVA = 0.16;

    // Métodos get y set
    public double getTotalSinIVA() {
        return totalSinIVA;
    }

    public void setTotalSinIVA(double totalSinIVA) {
        this.totalSinIVA = totalSinIVA;
    }

    // Constructor
    public Factura() {
        super();
    }

    // Métodos de la clase
    public double totalConIVA() {
        return this.totalSinIVA * (1 + IVA);
    }

    public void asignarValor(double valor) {
        if (Constantes.valorMin < valor) {
            this.totalSinIVA = valor;
        } else {
            this.totalSinIVA = 0;
        }
    }

    public void rebaja(double dcto) {
        this.totalSinIVA *= (1 - dcto / 100);
    }
}
