package responsabilidadunica;

public class Rectangulo {

    private double ancho;
    private double alto;

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public double calcularArea(){
        return alto * ancho;
    }

    public void dibujar(){

    }
}
