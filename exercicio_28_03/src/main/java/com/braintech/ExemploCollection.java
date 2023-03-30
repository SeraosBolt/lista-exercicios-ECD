package com.braintech;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploCollection {
    // Collections é uma classe utilitária em Java que fornece diversos métodos
    // estáticos para operações em coleções, como ordenação, pesquisa e operações de
    // rotina em objetos List, Set e Map. Algumas das operações comuns que você pode
    // realizar com a ajuda da classe Collections incluem:
    // Ordenação de uma lista em ordem crescente ou decrescente
    // Pesquisa binária em uma lista ordenada
    // Embaralhamento aleatório de elementos em uma lista
    // Criação de uma lista imutável ou não modificável

    List<String> lista = new ArrayList<>();

    public ExemploCollection() {
        lista.add("banana");
        lista.add("maçã");
        lista.add("laranja");
        Collections.sort(lista);
    }

    public void getLista() {
        System.out.println("Exemplo Collection");
        for (String elem : lista) {
            System.out.println(elem);
        }
    }
    // Neste exemplo, criamos uma List de String e adicionamos três elementos à
    // lista. Em seguida, usamos o método sort() da classe Collections para
    // classificar a lista em ordem alfabética crescente. Por fim, usamos um loop
    // for-each para percorrer a lista e imprimir cada elemento na tela.
}
