package responsabilidadunica;

public class Espejo {

    private Rectangulo rectangulo;
    private double precioMaterial;

    public Espejo(Rectangulo espejo, double precioMaterial) {
        this.rectangulo = espejo;
        this.precioMaterial = precioMaterial;
    }

    public double obtenerPrecioEspejo() {
        return rectangulo.calcularArea() * precioMaterial;
    }
}
