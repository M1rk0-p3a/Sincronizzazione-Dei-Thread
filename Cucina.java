package com.mycompany.thread1;

import java.util.Random;

/**
 * Classe che rappresenta una cucina condivisa tra più chef.
 * Contiene risorse limitate: piatti, posate e dessert.
 */
public class Cucina {
    private int nPiatti;
    private int nPosate;
    private int numDessert;
    private final Random rand = new Random();

    /**
     * Costruttore per inizializzare le risorse della cucina.
     *
     * @param nPiatti    Numero iniziale di piatti disponibili.
     * @param nPosate    Numero iniziale di posate disponibili.
     * @param numDessert Numero iniziale di dessert disponibili.
     */
    public Cucina(int nPiatti, int nPosate, int numDessert) {
        this.nPiatti = nPiatti;
        this.nPosate = nPosate;
        this.numDessert = numDessert;
    }

    /**
     * Metodo sincronizzato che simula l'utilizzo della cucina da parte di uno chef.
     * Ogni chef può decidere casualmente quali risorse utilizzare.
     */
    public synchronized void usoCucina(String nomeChef) {
        System.out.println("Chef " + nomeChef + " sta utilizzando la cucina.");

        // Decidere casualmente quali risorse utilizzare
        boolean usaPiatti = rand.nextBoolean();
        boolean usaPosate = rand.nextBoolean();
        boolean usaDessert = rand.nextBoolean();

        // Utilizzo dei piatti
        if (usaPiatti) {
            if (nPiatti > 0) {
                int numero = rand.nextInt(nPiatti) + 1;
                nPiatti -= numero;
                System.out.println("Chef " + nomeChef + " ha usato " + numero + " piatti. Rimasti: " + nPiatti);
            } else {
                System.out.println("Chef " + nomeChef + ": Non ci sono piatti disponibili.");
            }
        }

        // Utilizzo delle posate
        if (usaPosate) {
            if (nPosate > 0) {
                int numero = rand.nextInt(nPosate) + 1;
                nPosate -= numero;
                System.out.println("Chef " + nomeChef + " ha usato " + numero + " posate. Rimaste: " + nPosate);
            } else {
                System.out.println("Chef " + nomeChef + ": Non ci sono posate disponibili.");
            }
        }

        // Utilizzo dei dessert
        if (usaDessert) {
            if (numDessert > 0) {
                int numero = rand.nextInt(numDessert) + 1;
                numDessert -= numero;
                System.out.println("Chef " + nomeChef + " ha preparato " + numero + " dessert. Rimasti: " + numDessert);
            } else {
                System.out.println("Chef " + nomeChef + ": Non ci sono dessert disponibili.");
            }
        }

        System.out.println("Chef " + nomeChef + " ha finito di usare la cucina.\n");
    }
}
