/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista.exercicios.pkg2;

import java.util.ArrayList;

/**
 *
 * @author Diego
 */
public class Ordenacoes {

    ArrayList<Integer> newArray = new ArrayList();

    public void ordenacaoInsersao(ArrayList<Integer> original) {
        int chave, j;
        System.out.println("Você escolheu ordenação por Inserção");
        System.out.println("Vetor Original:");
        for (int i = 0; i < original.size(); i++) {
            System.out.print(original.get(i));

        }
        for (int i = 1; i < original.size(); i++) {
            chave = original.get(i);

            for (j = i - 1; (j >= 0 && original.get(j) > chave); j--) {

                newArray.add((j + 1), original.get(j));

            }
            newArray.add((j + 1), chave);
        }
        System.out.println("");
        System.out.println("Vetor ordenado por Inserção: ");
        for (int i = 0; i < newArray.size(); i++) {
            System.out.print(newArray.get(i));
        }
        System.out.println("");

    }
}
