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
        for (int j = 1; j < 1000; j++) {
            boolean primo = true;
            for (int i = 2; i < j; i++) {
                if (j % i == 0) {
                    primo = false;
                }
            }
            if (primo) {
                soma += j;

            }

        }
        System.out.println("Soma dos numeros Primos: " + soma);
    }
}
