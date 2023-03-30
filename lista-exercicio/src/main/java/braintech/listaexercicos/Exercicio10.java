/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package braintech.listaexercicos;

/**
 *
 * @author Diego
 */
public class Exercicio10 {

    public  int produto(int a, int b) {
        if (a == 0 || b == 0) {
             return 0;
        }
        if (b == 1) {
           return a;
        }
        int produto =  a + produto(a, b-1);
        return produto;
    }
}
