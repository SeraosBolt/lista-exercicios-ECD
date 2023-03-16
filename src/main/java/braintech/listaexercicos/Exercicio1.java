/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package braintech.listaexercicos;

/**
 *
 * @author Diego
 */
public class Exercicio1 {

    public void getSomaPar() {
        int soma = 0;
        for (int i = 1; i < 1000; i++) {
            if (i % 2 == 0) {
                soma += i;
            }
        }
        System.out.println("Soma dos numeros pares: " + soma);
    }
}
