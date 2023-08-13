package factura;

public class PruebaAcumulador {
    public static void main(String[] args) {
        Acumulador acumulador = new Acumulador(25);

        acumulador.incremento(10);
        System.out.println(acumulador.getValor());
    }
}
