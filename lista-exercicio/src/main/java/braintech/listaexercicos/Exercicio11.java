/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package braintech.listaexercicos;

/**
 *
 * @author Diego
 */
public class Exercicio11 {
    
    public int potencia(int a, int b) {
    if (b == 0) {
        return 1;
    } else if (b % 2 == 0) {
        int resultado = potencia(a, b/2);
        return resultado * resultado;
    } else {
        int resultado = potencia(a, (b-1)/2);
        return a * resultado * resultado;
    }
}
}
