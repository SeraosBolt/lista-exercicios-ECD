/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package braintech.listaexercicos;

import java.util.*;

/**
 *
 * @author Diego
 */
public class Exercicio9 {

    private boolean contemNum(int[] array, int tamanho, int elemento) {
        for (int i = 0; i < tamanho; i++) {
            if (array[i] == elemento) {
                return true;
            }
        }
        return false;
    }

    public void unirArrays(int arrayUm[], int arrayDois[]) {
        int unidos[] = new int[arrayUm.length + arrayDois.length];
        int pos = 0;
        for (int i = 0; i < arrayUm.length; i++) {
            if (!contemNum(unidos, pos, arrayUm[i])) {
                unidos[pos++] = arrayUm[i];
            }
        }
        for (int i = 0; i < arrayDois.length; i++) {
            if (!contemNum(unidos, pos, arrayDois[i])) {
                unidos[pos++] = arrayDois[i];
            }
        }

        for (int num : unidos) {
            if (num != 0) {
                System.out.print(num + " ");
            }
        }
    }
}
