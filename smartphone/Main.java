package smartphone;

public class Main {
    public static void main(String[] args) {
        Smartphone iphone = new Smartphone();

        iphone.encenderRadio();
        iphone.apagarRadio();
        iphone.obternerCoordenadas();
        iphone.obtenerCoordenadasAprox();
        iphone.play();
        iphone.siguiente();

        ReproductorMusica.comercial("Coca Cola");
    }
}
