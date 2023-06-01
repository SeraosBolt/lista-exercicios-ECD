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

    private static int tamanho;
    private static Scanner scan = new Scanner(System.in);
    private static ArrayList<Integer> array = new ArrayList();
    private static boolean canRender = false;
    private static int option;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        exibirMenu();

    }

    public static void exibirMenu() {
        Ordenacoes ord = new Ordenacoes();
        System.out.println("                 MENU ORDENAÇÃO                         ");
        System.out.println("╔═══════════════════════════════╗");
        System.out.println("║ 1. Ordenação por Inserção                           ║");
        System.out.println("║ 2. Ordenação por Seleção                            ║");
        System.out.println("║ 3. Ordenação por Bolha                              ║");
        System.out.println("║ 4. Pesquisar Número                                 ║");
        System.out.println("║ 5. Sair                                             ║");
        System.out.println("╚═══════════════════════════════╝");
        option = scan.nextInt();
        opcoesMenu(option, ord);
    }

    private static void getNumeros() {
        array.clear();
        System.out.println("Digite o tamanho do Vetor/Array: ");
        try {
            tamanho = scan.nextInt();
            canRender = true;
        } catch (Exception e) {
            System.out.println("tem que ser um numero Inteiro");
            canRender = false;
        }
        if (canRender) {
            int i = 0;
            while (i < tamanho) {
                int num;
                System.out.println("Digite os Numeros do Array, digite 0 para sair");
                try {
                    num = scan.nextInt();
                    array.add(num);
                } catch (Exception e) {
                    System.out.println("tem que ser um numero Inteiro");
                }
                i++;
            }
        }
    }

    private static void insersao(Ordenacoes ord) {
        getNumeros();
        long tempoInicial = System.nanoTime();
        ord.ordenacaoInsersao(array);
        long tempoFinal = System.nanoTime() - tempoInicial;
        System.out.println("Tempo de execução em Milisegundos: " + tempoFinal);
        exibirMenu();
    }

    private static void selecao(Ordenacoes ord) {
        getNumeros();
        long tempoInicial = System.nanoTime();
        ord.ordenacaoSelecao(array);
        long tempoFinal = System.nanoTime() - tempoInicial;
        System.out.println("Tempo de execução em Milisegundos: " + tempoFinal);
        exibirMenu();
    }

    private static void bolha(Ordenacoes ord) {
        getNumeros();
        long tempoInicial = System.nanoTime();
        ord.ordenacaoBolha(array);
        long tempoFinal = System.nanoTime() - tempoInicial;
        System.out.println("Tempo de execução em Milisegundos: " + tempoFinal);
        exibirMenu();
    }

    private static void pesquisa(Ordenacoes ord) {
        int chave = 0;
        System.out.println("Digite o numero a ser pesquisado: ");
        try {
            chave = scan.nextInt();
        } catch (Exception e) {
            System.out.println("tem que ser um numero Inteiro");
        }
        ord.pesquisaBinaria(array, chave);
        exibirMenu();
    }

    private static void opcoesMenu(int opcao, Ordenacoes ord) {
        switch (opcao) {
            case 1:
                insersao(ord);
                break;
            case 2:
                selecao(ord);
                break;
            case 3:
                bolha(ord);
                break;
            case 4:
                pesquisa(ord);
                break;
            case 5:
                System.out.println("Saindo ...");
                break;

            default:
                System.out.println("Opção Invalida!");
                exibirMenu();
        }
    }

}
