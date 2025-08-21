package override;

public class Carro extends Veiculo {
    public Carro(String cor, String modelo, String placa) {
        super(cor, modelo, placa);
    }

    @Override
    public void iniciar() {
        System.out.println("Carro está iniciando...");
    }

}
