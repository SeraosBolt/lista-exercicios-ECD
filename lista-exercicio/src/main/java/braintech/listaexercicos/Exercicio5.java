/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package braintech.listaexercicos;

/**
 *
 * @author Diego
 */
public class Exercicio5 {

    int fibNumbers[] = new int[10];

    private int fibonacci(int i) {
        if (i < 2) {
            return i;
        } else {
            return fibonacci(i - 1) + fibonacci(i - 2);
        }
    }

    public void getFibonacci() {
        for (int i = 0; i < 10; i++) {
            fibNumbers[i] = fibonacci(i);
        }
        for (int i = 0; i < fibNumbers.length; i++) {
            System.out.println(fibNumbers[i]);
        }
    }
}
