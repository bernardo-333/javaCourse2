package herança;

public class Gato extends Animal {

    public Gato(String nome, String cor, double peso) {
        super(nome, cor, peso);
    }

    @Override
    public void fazerSom() {
        System.out.println("O som é: MIAUUUUUUU");
    }


}
