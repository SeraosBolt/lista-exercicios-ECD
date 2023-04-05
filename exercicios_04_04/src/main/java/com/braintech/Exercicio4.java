package com.braintech;

import java.util.ArrayList;
import java.util.List;

public class Exercicio4 {
    List<Integer> lista = new ArrayList<>();

    public void criarArray() {
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        lista.add(6);
        lista.add(7);
        lista.add(9);
        lista.add(10);
        lista.add(11);
    }

    public void printArray() {
        System.out.println("_______________________________________________________________");
        System.out.println("Lista Criada: ");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
        System.out.println("_______________________________________________________________");
    }
}
