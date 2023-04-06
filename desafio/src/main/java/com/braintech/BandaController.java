package com.braintech;

import java.util.ArrayList;

public class BandaController {
    public ArrayList<String> bandas = new ArrayList<String>();

    public void addBanda(String banda) {
        bandas.add(banda);
        System.out.println("Banda adicionada com sucesso!");

    }

    public void removeBanda(int index) {
        bandas.remove(index);
        System.out.println("Banda removida com sucesso!");

    }

    public void removeAllBandas() {
        bandas.clear();
        System.out.println("Todas as bandas foram removidas com sucesso!");
    }

    public void changeBandaPosition(int currentIndex, int nextIndex) {
        String tempBanda = bandas.get(currentIndex);
        bandas.set(currentIndex, bandas.get(nextIndex));
        bandas.set(nextIndex, tempBanda);
        System.out.println("Posição da banda alterada com sucesso!");

    }

    public void showBandas() {
    // código ASCII para a borda
    String border = "╔══════════════════════════════════════════════╗\n";
    border += "║              Lista de bandas                 ║\n";
    border += "╠══════════════════════════════════════════════╣";

    // cor da mensagem
    String color = "\u001B[35m"; // cor magenta

    // exibindo a borda e a lista de bandas
    System.out.println(color + border + color); // resetando a cor
    for (int i = 0; i < bandas.size(); i++) {
        System.out.println(String.format("║  %-42s  ║", bandas.get(i)));
    }

    // borda inferior
    System.out.println("╚══════════════════════════════════════════════╝");
    System.out.println("");
    System.out.println(color + border + "\u001B[0m"); // resetando a cor

    }

}
