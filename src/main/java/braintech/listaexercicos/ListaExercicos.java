/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package braintech.listaexercicos;

/**
 *
 * @author Diego
 */
public class ListaExercicos {

    public static void main(String[] args) {
        int numeros[] = {1, 20, 345, 10, 5, 2, 153};
        int arrayUm[] = {1, 2, 3, 4};
        int arrayDois[] = {5, 6, 7, 8};
        int interArray[] = {1, 2, 3, 4, 5};
        int interArrayDois[] = {1, 2, 9, 5, 10};
        int uniaoArray[] = {1, 2, 3, 4, 5};
        int uniaoArrayDois[] = {4, 5, 6, 7, 8};
        int produto;
        Exercicio1 ex1 = new Exercicio1();
        Exercicio2 ex2 = new Exercicio2();
        Exercicio3 ex3 = new Exercicio3();
        Exercicio4 ex4 = new Exercicio4();
        Exercicio5 ex5 = new Exercicio5();
        Exercicio6 ex6 = new Exercicio6();
        Exercicio7 ex7 = new Exercicio7();
        Exercicio8 ex8 = new Exercicio8();
        Exercicio9 ex9 = new Exercicio9();
        Exercicio10 ex10 = new Exercicio10();
        Exercicio11 ex11 = new Exercicio11();
        System.out.println("Exercicio 1");
        ex1.getSomaPar();
        System.out.println("Exercicio 2");
        ex2.getSomaPrimos();
        System.out.println("Exercicio 3");
        ex3.getFatorial();
        System.out.println("Exercicio 4");
        ex4.getPrimeirosPrimos();
        System.out.println("Exercicio 5");
        ex5.getFibonacci();
        System.out.println("Exercicio 6");
        ex6.analisaArray(numeros);
        System.out.println("Exercicio 7");
        ex7.concatenaArray(arrayUm, arrayDois);
        System.out.println("Exercicio 8");
        ex8.getInterseccao(interArray, interArrayDois);
        System.out.println("Exercicio 9");
        ex9.unirArrays(uniaoArray, uniaoArrayDois);
        System.out.println("Exercicio 10");
        System.out.println(ex10.produto(5, 10));
        System.out.println("Exercicio 11");
        System.out.println(ex11.potencia(7, 2));
    }
}
