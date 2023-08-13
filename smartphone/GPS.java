package smartphone;

public interface GPS {
    public void obternerCoordenadas();
    default public void obtenerCoordenadasAprox() {
        System.out.println("Obteniendo coordenadas aproximadas");
    }
}
