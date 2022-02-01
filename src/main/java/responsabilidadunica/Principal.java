package responsabilidadunica;

public class Principal {

    public static void main(String[] args) {
        double ancho = 20;
        double alto = 10;
        double precioMaterial = 2;

        Rectangulo rectangulo = new Rectangulo(ancho, alto);

        Espejo espejo = new Espejo(rectangulo, precioMaterial);

        System.out.println(espejo.obtenerPrecioEspejo());
    }
}
