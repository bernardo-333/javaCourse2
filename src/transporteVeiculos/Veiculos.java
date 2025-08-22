package transporteVeiculos;

public class Veiculos {
    private String modelo;

    public Veiculos(String modelo) {
        this.modelo = modelo;
    }

    public float calcularTempo(float distancia) {
        return distancia / 100;
    }


    // @Override
    public String toString() {
        return "Veiculos{" +
                "modelo='" + modelo + '\'' +
                '}';
    }
}
