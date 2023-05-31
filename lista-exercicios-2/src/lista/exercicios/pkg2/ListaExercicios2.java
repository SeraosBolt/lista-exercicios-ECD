/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista.exercicios.pkg2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class ListaExercicios2 {

    private static int option = 1;
    private static Scanner scan = new Scanner(System.in);
    private static ArrayList<Integer> array = new ArrayList();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ordenacoes ord = new Ordenacoes();
        while (option != 0) {
            System.out.println("Digite os Numeros do Array, digite x para sair");
            int opt = scan.nextInt();
            if (opt != 0) {
                array.add(opt);
            }else{
                option = opt;
            }
        }
        ord.ordenacaoInsersao(array);
    }

}
