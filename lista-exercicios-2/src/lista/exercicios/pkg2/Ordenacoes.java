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
        int[] array = new int[original.size()];
        System.out.println("Você escolheu ordenação por Inserção");
        System.out.println("Vetor Original:");
        for (int i = 0; i < original.size(); i++) {
            System.out.print(original.get(i));
            array[i] = original.get(i);
        }

        for (int i = 1; i < array.length; i++) {
            chave = array[i];

            for (j = i - 1; (j >= 0 && array[j] > chave); j--) {

                array[j + 1] = array[j];

            }
            array[j + 1] = chave;
        }

        System.out.println("");
        System.out.println("Vetor ordenado por Inserção: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.println("");
    }

    public void ordenacaoSelecao(ArrayList<Integer> original) {
        int[] array = new int[original.size()];
        System.out.println("Você escolheu ordenação por Seleção");
        System.out.println("Vetor Original:");
        for (int i = 0; i < original.size(); i++) {
            System.out.print(original.get(i));
            array[i] = original.get(i);
        }
        for (int i = 0; i < array.length - 1; i++) {
            int posicaoMenor = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[posicaoMenor]) {
                    posicaoMenor = j;
                }
            }

            if (posicaoMenor != i) {
                int aux = array[i];
                array[i] = array[posicaoMenor];
                array[posicaoMenor] = aux;
            }
        }
        System.out.println("");
        System.out.println("Vetor ordenado por Seleção: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.println("");
    }

    public void ordenacaoBolha(ArrayList<Integer> original) {
        int[] array = new int[original.size()];
        boolean houveTroca = true;
        System.out.println("Você escolheu ordenação por Bolha");
        System.out.println("Vetor Original:");
        for (int i = 0; i < original.size(); i++) {
            System.out.print(original.get(i));
            array[i] = original.get(i);
        }
        while (houveTroca) {
            houveTroca = false;

            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int aux = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = aux;
                    houveTroca = true;
                }
            }
        }
        System.out.println("");
        System.out.println("Vetor ordenado por Bolha: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.println("");
    }

    public void pesquisaBinaria(ArrayList<Integer> original, int chave) {
        int num, j;
        int[] array = new int[original.size()];
        for (int i = 0; i < original.size(); i++) {
            array[i] = original.get(i);
        }
        for (int i = 1; i < array.length; i++) {
            num = array[i];

            for (j = i - 1; (j >= 0 && array[j] > num); j--) {

                array[j + 1] = array[j];

            }
            array[j + 1] = num;
        }
        int posicao = pesquisa(chave, array);

        if (posicao >= 0) {
            System.out.println("O Elemento " + chave + " está localizado na "
                    + "posição: " + posicao);
        } else {
            System.out.println(
                    "O Elemento " + chave + " não foi localizado na lista");
        }
    }

    private static int pesquisa(int chave, int[] vet) {
        int esquerda, meio, direita;
        esquerda = 0;
        direita = vet.length - 1;

        while (esquerda <= direita) {
            meio = (esquerda + direita) / 2;
            if (chave == vet[meio]) {
                return meio;
            }
            if (chave > vet[meio]) {
                esquerda = meio + 1;
            } else {
                direita = meio - 1;
            }

        }
        return -1;
    }
}
