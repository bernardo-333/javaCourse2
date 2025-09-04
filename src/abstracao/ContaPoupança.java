package abstracao;

public class ContaPoupança extends Conta{
    public ContaPoupança(int numero, int agencia, String titular, double saldo) {
        super(numero, agencia, titular, saldo);
    }

    @Override
    void calcularTarifaMensal() {
        System.out.println("Tarifa Mensal de R$ 0,00, esta conta não debita tarifa");
    }
}
