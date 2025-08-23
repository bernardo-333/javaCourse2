package transporteVeiculos;

public class Veiculos {
    private String modelo;

    public Veiculos(String modelo) {
        this.modelo = modelo;
    }

    public float calcularTempo(float distancia) {
        return distancia / 100;
    }

    public void converter(double tempo) {
        int horas = (int) tempo;
        int minutos = (int) ((tempo - horas)*60);
        System.out.println("Tempo percorrido é de "+horas+"h "+minutos+"min");
    }

    // @Override
    public String toString() {
        return "Veiculos{" +
                "modelo='" + modelo + '\'' +
                '}';
    }
}
