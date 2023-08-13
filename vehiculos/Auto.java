package vehiculos;

public class Auto implements Vehiculo {
    
    // Constructor
    public Auto() {
        super();
    }
    
    // Métodos de la interface
    @Override
    public void arrancar() {
        System.out.println("Arrancando motor");
    }

    @Override
    public void detener() {
        System.out.println("Deteniendo motor");
    }
    
}
