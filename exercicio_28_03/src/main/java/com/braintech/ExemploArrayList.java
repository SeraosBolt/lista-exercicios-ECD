package com.braintech;

import java.util.ArrayList;

public class ExemploArrayList {
    ArrayList<String> lista = new ArrayList<>();

    // ArrayList é uma classe em Java que implementa a interface List e é usada para
    // armazenar uma sequência de elementos em uma lista. Ao contrário do array
    // padrão em Java, um ArrayList tem um tamanho flexível e pode ser facilmente
    // redimensionado quando necessário. Além disso, ArrayList permite acesso rápido
    // aos seus elementos, permitindo a busca e a inserção de elementos em tempo
    // constante.
    public ExemploArrayList() {
        lista.add("elemento1");
        lista.add("elemento2");
        lista.add("elemento3");
    }

    public void printList() {
        System.out.println("Exemplo ArrayList");
        for (String elemento : lista) {
            System.out.println(elemento);
        }
    }
    // Uma das principais vantagens do ArrayList é a sua capacidade de redimensionar
    // automaticamente. Quando você adiciona ou remove elementos de um ArrayList, a
    // capacidade interna do ArrayList é automaticamente ajustada para acomodar o
    // novo tamanho. Isso significa que você não precisa se preocupar em alocar ou
    // desalocar memória manualmente, como acontece com arrays regulares em Java.
    // Outra vantagem do ArrayList é que ele fornece métodos úteis para trabalhar
    // com elementos em uma lista, como add(), remove(), get() e set(). Esses
    // métodos permitem que você adicione elementos ao final da lista, remova
    // elementos da lista, acesse elementos em uma posição específica e modifique os
    // elementos existentes na lista.
}
