package com.braintech;

import java.util.ArrayList;
import java.util.List;

public class Exercicio2 {
    List<Integer> lista = new ArrayList<>();

    public Exercicio2() {
        lista.add(11);
        lista.add(22);
        lista.add(33);
        lista.add(10);
        lista.add(21);
        lista.add(35);
        lista.add(112);
        lista.add(223421);
        lista.add(331234);
    }

    public void tamanhoLista() {
        System.out.println("_______________________________________________________________");
        System.out.println("Tamanho da lista: " + lista.size());
        System.out.println("_______________________________________________________________");

    }
}
