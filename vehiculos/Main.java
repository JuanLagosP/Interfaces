package vehiculos;

public class Main {
    public static void main(String[] args) {
        
        Vehiculo tesla = new Auto();
        Vehiculo etn = new Camion();

        Interruptor.encenderMotor(tesla);
        Interruptor.encenderMotor(etn);
    }
}