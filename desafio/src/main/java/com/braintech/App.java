package com.braintech;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    static int option;
    static BandaController bandaController = new BandaController();

    static public void mainMenu(BandaController bandaController) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("╔═════════════════════════════════════════════╗");
        System.out.println("║      Bem-vindo ao sistema de gerenciamento  ║");
        System.out.println("║                  de bandas                  ║");
        System.out.println("╠═════════════════════════════════════════════╣");
        System.out.println("║                Escolha uma opção:           ║");
        System.out.println("║                                             ║");
        System.out.println("║   1. Adicionar banda                        ║");
        System.out.println("║   2. Remover banda                          ║");
        System.out.println("║   3. Remover todas as bandas                ║");
        System.out.println("║   4. Alterar posição da banda               ║");
        System.out.println("║   5. Mostrar todas as bandas                ║");
        System.out.println("║   6. Sair                                   ║");
        System.out.println("║                                             ║");
        System.out.println("╚═════════════════════════════════════════════╝");
        

        option = scanner.nextInt();

        switch (option) {
            case 1:
                addBanda(bandaController, scanner);
                break;
            case 2:
                removeBanda(bandaController, scanner);
                break;

            case 3:
                removeAllBandas(bandaController);
                break;
            case 4:
                changeBandaPosition(bandaController, scanner);
                break;

            case 5:
                bandaController.showBandas();
                mainMenu(bandaController);
                break;
            case 6:
                System.out.println("Saindo do sistema...");
                break;
            default:
                System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                mainMenu(bandaController);
                break;
        }

    }

    static public void addBanda(BandaController bandaController, Scanner scanner) {
        System.out.println("Digite o nome da banda:");
        /// Não sei porque mas se eu não colocar essa linha aqui, o programa não
        /// funciona
        String banda = scanner.nextLine();
        String banda1 = scanner.nextLine();
        bandaController.addBanda(banda1);
        mainMenu(bandaController);
    }

    static public void removeBanda(BandaController bandaController, Scanner scanner) {
        System.out.println("Digite o índice da banda:");
        int index = scanner.nextInt();
        bandaController.removeBanda(index);
        mainMenu(bandaController);
    }

    static public void removeAllBandas(BandaController bandaController) {
        bandaController.removeAllBandas();
        mainMenu(bandaController);
    }

    static public void changeBandaPosition(BandaController bandaController, Scanner scanner) {
        System.out.println("Digite o índice atual da banda:");
        int currentIndex = scanner.nextInt();
        System.out.println("Digite o índice da nova posição da banda:");
        int nextIndex = scanner.nextInt();
        bandaController.changeBandaPosition(currentIndex, nextIndex);
        mainMenu(bandaController);
    }

    public static void main(String[] args) {

        mainMenu(bandaController);

    }
}
