package com.braintech;

import java.util.ArrayList;
import java.util.List;

public class ExemploList {

    // List é uma interface que representa uma sequência de elementos ordenados. Em
    // Java, List é uma das interfaces principais do framework de coleções e é
    // implementada por várias classes como ArrayList, LinkedList e Vector. A
    // principal característica de uma List é que ela mantém a ordem dos elementos
    // que são adicionados a ela. Isso significa que, se você adiciona um elemento
    // na posição X, ele permanecerá na posição X.

    List<String> lista = new ArrayList<>();

    public ExemploList() {
        lista.add("elemento1");
        lista.add("elemento2");
        lista.add("elemento3");
    }

    public void printList() {
        System.out.println("Exemplo List");
        for (String elemento : lista) {
            System.out.println(elemento);
        }
    }

    // Neste exemplo, criamos uma List de String usando a classe ArrayList. Em
    // seguida, adicionamos três elementos à lista por meio do construtor, por fim,
    // criamos o metodo printList e usamos um loop for-each para percorrer a lista e
    // imprimir cada elemento na tela.
}
