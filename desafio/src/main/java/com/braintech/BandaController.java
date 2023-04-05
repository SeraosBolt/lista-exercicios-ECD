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
        System.out.println("Lista de bandas:");
        for (int i = 0; i < bandas.size(); i++) {
            System.out.println(bandas.get(i));
        }
    }

}
