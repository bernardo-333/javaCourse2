package herança;

public class Vaca extends Animal{
    public Vaca(String nome, String cor, double peso) {
        super(nome, cor, peso);
    }

    @Override
    public void fazerSom() {
        System.out.println("O som é: MUUUUUUUUUUU");
    }
}
