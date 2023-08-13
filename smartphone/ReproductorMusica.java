package smartphone;

public interface ReproductorMusica extends Reproductor{
    default public void siguiente() {
        System.out.println("Siguiente canción");
    }
    public static void comercial(String patrocinador) {
        System.out.println("A continuación un mensaje de nuestro sponsor: " + patrocinador);
    }
}
