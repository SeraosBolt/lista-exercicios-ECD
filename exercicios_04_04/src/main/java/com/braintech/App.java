package com.braintech;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Exercicio1 exercicio1 = new Exercicio1();
        Exercicio2 exercicio2 = new Exercicio2();
        Exercicio3 exercicio3 = new Exercicio3();
        Exercicio4 exercicio4 = new Exercicio4();
        Exercicio5 exercicio5 = new Exercicio5();
        exercicio1.adicionar(10);
        exercicio1.adicionar(20);
        exercicio1.adicionar(30);
        exercicio1.printLista();
        exercicio2.tamanhoLista();
        exercicio3.removePar();
        exercicio4.criarArray();
        exercicio4.printArray();
        exercicio5.getMaiorNumero();
    }
}
