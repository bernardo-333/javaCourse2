package abstracao;

public class ContaCorrente extends Conta{
    public ContaCorrente(int numero, int agencia, String titular, double saldo) {
        super(numero, agencia, titular, saldo);
    }

    @Override
    void calcularTarifaMensal() {
        System.out.println("Tarifa Mensal de R$ 12,00, descontado do saldo!!!");
        saldo = saldo - 12;
    }


}
