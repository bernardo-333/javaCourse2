package abstracao;

public class ContaPessoaJuridica extends Conta{

    private double taxa = 1.50;

    public ContaPessoaJuridica(int numero, int agencia, String titular, double saldo) {
        super(numero, agencia, titular, saldo);
    }

    @Override
    public void sacar(double valor){
        System.out.println("Valor de saque R$"+valor+" com taxa de R$ realizado com sucesso!!!");
        saldo = (saldo-valor) - taxa;
    }

    @Override
    void calcularTarifaMensal() {
        System.out.println("Tarifa Mensal de R$ 20,00, descontado do saldo!!!");
        saldo = saldo - 20;
    }

}
