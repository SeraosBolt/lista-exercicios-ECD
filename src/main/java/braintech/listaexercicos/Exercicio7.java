/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package braintech.listaexercicos;

/**
 *
 * @author Diego
 */
public class Exercicio7 {

    public void concatenaArray(int arrayUm[], int arrayDois[]) {
        int tamanhoArray = arrayUm.length + arrayDois.length;
        int concatenado[] = new int[tamanhoArray];
        
        for (int i = 0; i < arrayUm.length; i++) {
            concatenado[i] = arrayUm[i];
        }
        
        for(int x = 0; x < arrayDois.length; x++){
            concatenado[x+arrayUm.length] = arrayDois[x];
        }
        for(int i =0; i < concatenado.length; i++){
            System.out.print(concatenado[i] + " - ");
        }   
    }
}