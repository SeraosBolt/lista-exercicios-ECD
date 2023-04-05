package com.braintech;

import java.util.List;
import java.util.ArrayList;

public class Exercicio1 {
    List<Integer> lista = new ArrayList<Integer>();

    public void adicionar(int numero) {
        lista.add(numero);
    }

    public void printLista() {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }
}
