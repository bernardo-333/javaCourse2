package transporteVeiculos;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Veiculos> veiculos = new ArrayList<>();
        veiculos.add(new Carro("celta"));
        veiculos.add(new Bicicleta("caloi"));
        veiculos.add(new Onibus("mercedes",4));

        for (Veiculos i : veiculos) {
            Double tempo;
            System.out.println(i);
            tempo = (double) i.calcularTempo(100);
            i.converter(tempo);
        }



    }



}
