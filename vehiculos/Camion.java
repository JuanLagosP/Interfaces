package vehiculos;

public class Camion implements Vehiculo {
    
    // Constructor
    public Camion() {
        super();
    }

    // Métodos de la interface
    @Override
    public void arrancar() {
        System.out.println("Arrancando el motor del camión");
    }
    
    @Override
    public void detener() {
        System.out.println("Deteniendo el motor del camión");
    }

}
