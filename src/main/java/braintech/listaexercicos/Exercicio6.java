/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package braintech.listaexercicos;

/**
 *
 * @author Diego
 */
public class Exercicio6 {

    private int menor = 999999999;
    private int maior = 0;
    private int media;

    void menorMaior(int num) {
        if (num > maior && num > menor) {
            maior = num;
        } else if(num < menor) {
            menor = num;
        }
    }

    void calcMedia(int nums[]) {
        int soma = 0;
      for(int i= 0; i< nums.length; i++){
          soma += nums[i];
       }
      media = soma/nums.length;
    }

    public void analisaArray(int numeros[]) {
        for(int i =0; i < numeros.length; i++){
            menorMaior(numeros[i]);
        }
        calcMedia(numeros);
        
        System.out.println("Maior numero: " + maior);
        System.out.println("Menor numero: " + menor);
        System.out.println("Média dos numeros: " + media);
        
    }
}
