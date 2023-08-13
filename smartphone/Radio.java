package smartphone;

public interface Radio {
    public void encenderRadio();
    public void apagarRadio();
    default public void siguiente() {
        System.out.println("Siguiente estación");
    }
}