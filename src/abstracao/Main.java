package abstracao;

public class Main {

    public static void main(String[] args) {
        Conta CC = new ContaCorrente(21822, 12312, "bernardo", 100);
        Conta CP = new ContaPoupança(75241, 32133, "fiamma", 100);
        Conta PJ = new ContaPessoaJuridica(23123, 23133, "kenps", 100);

        System.out.println("----Contas Saques, Depositos e Saldo----\n");

        System.out.println("Conta Corrente:");
        CC.calcularTarifaMensal();
        CC.exibirSaldo();
        CC.sacar(10);
        CC.exibirSaldo();
        System.out.println();
        System.out.println("Conta Poupança:");
        CP.calcularTarifaMensal();
        CP.exibirSaldo();
        CP.sacar(10);
        CP.exibirSaldo();
        System.out.println();
        System.out.println("Conta Pessoa Juraidica:");
        PJ.calcularTarifaMensal();
        PJ.exibirSaldo();
        PJ.sacar(10);
        PJ.exibirSaldo();


    }



}
