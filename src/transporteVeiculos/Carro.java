package transporteVeiculos;

public class Carro extends Veiculos {
    private float velocidade = 80;

    public Carro(String modelo) {
        super(modelo);
    }

    @Override
    public float calcularTempo(float distancia) {
        return distancia / velocidade;
    }



}
