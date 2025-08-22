package transporteVeiculos;

public class Onibus extends Veiculos{
    private float velocidade = 60;
    private float numero_paradas;

    public Onibus(String modelo, float numero_paradas) {
        super(modelo);
        this.numero_paradas = numero_paradas;
    }

    @Override
    public float calcularTempo(float distancia) {
        return distancia / velocidade + (numero_paradas * 0.25f);
    }

}
