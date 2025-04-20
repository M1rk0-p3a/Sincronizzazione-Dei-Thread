package com.mycompany.thread1;

/**
 * Classe principale che avvia l'applicazione.
 * Crea una cucina condivisa e avvia più chef (thread) che la utilizzano.
 */
public class Thread1 {

    public static void main(String[] args) {
        // Creazione della cucina condivisa con risorse iniziali
        Cucina cucinaCondivisa = new Cucina(50, 200, 400);

        // Creazione degli chef che condividono la stessa cucina
        Chef chef1 = new Chef("Antonio", cucinaCondivisa);
        Chef chef2 = new Chef("Giuseppe", cucinaCondivisa);
        Chef chef3 = new Chef("Mario", cucinaCondivisa);
        Chef chef4 = new Chef("Luigi", cucinaCondivisa);

        System.out.println("Inizio della preparazione in cucina...\n");

        // Avvio dei thread degli chef
        chef1.start();
        chef2.start();
        chef3.start();
        chef4.start();

        // Attendere la terminazione di tutti i thread
        try {
            chef1.join();
            chef2.join();
            chef3.join();
            chef4.join();
        } catch (InterruptedException e) {
            System.err.println("Errore nell'attesa dei thread: " + e.getMessage());
        }

        System.out.println("Tutti gli chef hanno terminato la preparazione.");
    }
}
