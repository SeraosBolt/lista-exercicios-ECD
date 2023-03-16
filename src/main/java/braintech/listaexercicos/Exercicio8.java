/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package braintech.listaexercicos;

/**
 *
 * @author Diego
 */
public class Exercicio8 {
    public void getInterseccao(int arrayUm[], int arrayDois[]) {
        int tamanho = arrayUm.length + arrayDois.length;
        int interseccao[] = new int[tamanho];
        int pos = 0;
        for (int i = 0; i < arrayUm.length; i++) {
            for(int x =0; x < arrayDois.length; x++){
                if(arrayUm[i] == arrayDois[x]){
                    interseccao[pos] = arrayUm[i];
                    pos++;
                }
            }    
        }
        for(int i = 0; i<interseccao.length;i++){
            if(interseccao[i] != 0){
               System.out.print(interseccao[i] + " "); 
            }
        }
    }
}
