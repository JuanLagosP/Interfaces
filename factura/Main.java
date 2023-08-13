package factura;

public class Main {
    public static void main(String[] args) {
        Factura factura = new Factura();
        factura.asignarValor(250.0);

        System.out.printf("%s%n%s%n%s%n",
                "El precio sin IVA es: " + factura.getTotalSinIVA(),
                "El precio con IVA es: " + factura.totalConIVA(),
                "Rebajado durante agosto con un 20% de descuento"
        );

        factura.rebaja(20.0);
        System.out.printf("%s%n%s%n",
                "Rebajado sin IVA: " + factura.getTotalSinIVA(),
                "Rebajado con IVA: " + factura.totalConIVA()
        );
    }
}
