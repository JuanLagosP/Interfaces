package smartphone;

public class Smartphone implements GPS, Radio, ReproductorMusica {
    
    // Métodos de la interfaz GPS
    @Override
    public void obternerCoordenadas() {
        System.out.println("Latitud: 30, Longitud: 125");
    }

    // Métodos de la interfaz Radio
    @Override
    public void encenderRadio() {
        System.out.println("Radio encendido");
    }

    @Override
    public void apagarRadio() {
        System.out.println("Radio apagado");
    }

    // Métodos de la interfaz Reproductor de Música
    @Override
    public void play() {
        System.out.println("Reproduciendo música");
    }

    @Override
    public void pausa() {
        System.out.println("Pausando música");
    }

    @Override
    public void siguiente() {
        ReproductorMusica.super.siguiente();
    }

    // Constructor
    public Smartphone() {
        super();
    }
}
