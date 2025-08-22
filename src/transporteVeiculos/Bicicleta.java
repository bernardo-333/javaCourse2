package transporteVeiculos;

public class Bicicleta extends Veiculos{
    private float velocidade = 20;

    public Bicicleta(String modelo) {
        super(modelo);
    }

    @Override
    public float calcularTempo(float distancia) {
        return distancia / velocidade;
    }

}
