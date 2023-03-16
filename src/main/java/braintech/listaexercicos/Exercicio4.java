/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package braintech.listaexercicos;

/**
 *
 * @author Diego
 */
public class Exercicio4 {

    int primos[] = new int[20];
    int pos = 0;

    public void getPrimeirosPrimos() {
        for (int j = 2; j < 1000; j++) {
            boolean primo = true;
            for (int i = 2; i < j; i++) {
                if (j % i == 0) {
                    primo = false;
                }
            }
            if (primo) {
                primos[pos] = j;
                pos++;
            }
            if (pos == 20) {
                break;
            }
        }
        for (int x = 0; x < primos.length; x++) {

            System.out.println(primos[x]);
        }
    }

}
