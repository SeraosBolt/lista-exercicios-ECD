package com.braintech;

import java.util.ArrayList;
import java.util.List;

public class Exercicio3 {
    List<Integer> lista = new ArrayList<>();

    public Exercicio3() {
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

    public void removePar() {
        System.out.println("_______________________________________________________________");
        System.out.println("Lista original: ");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) % 2 == 0) {
                lista.remove(i);
            }
        }
        System.out.println("Lista sem números pares: ");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
        System.out.println("_______________________________________________________________");
    }
}
