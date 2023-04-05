package com.braintech;

import java.util.ArrayList;
import java.util.List;

public class Exercicio5 {
    List<Integer> lista = new ArrayList<>();

    public Exercicio5() {
        lista.add(13543);
        lista.add(23455);
        lista.add(96798);
        lista.add(975);
        lista.add(6543);
        lista.add(5463);
        lista.add(2345);
        lista.add(2345);
        lista.add(12134230);
        lista.add(3452);
    }

    public void getMaiorNumero(){
        int maior = 0;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) > maior) {
                maior = lista.get(i);
            }
        }
        System.out.println("_______________________________________________________________");
        System.out.println("Maior número da lista: " + maior);
        System.out.println("_______________________________________________________________");
    }


}
