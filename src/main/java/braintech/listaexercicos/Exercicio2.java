/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package braintech.listaexercicos;

/**
 *
 * @author Diego
 */
public class Exercicio2 {
        public void getSomaPrimos() {
        int soma = 0;
        for (int i = 1; i < 1000; i++) {
            if (i % i == 0) {
                soma += i;
            }
        }
        System.out.println("Soma dos numeros Primos: " + soma);
    }
}
