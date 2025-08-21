package override;

public class Veiculo {
    private String cor;
    private String modelo;
    private String placa;

    public Veiculo(String cor, String modelo, String placa) {
        this.cor = cor;
        this.modelo = modelo;
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void iniciar() {
        System.out.println("Veiculo está iniciando...");
    }

}
