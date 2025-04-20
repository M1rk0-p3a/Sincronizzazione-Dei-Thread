package com.mycompany.thread1;

/**
 * Classe che rappresenta uno chef che utilizza la cucina.
 * Estende la classe Thread per eseguire in parallelo.
 */
public class Chef extends Thread {
    private final Cucina cucina;

    /**
     * Costruttore per inizializzare lo chef con un nome e la cucina condivisa.
     *
     * @param nome   Nome dello chef.
     * @param cucina Istanza condivisa della cucina.
     */
    public Chef(String nome, Cucina cucina) {
        super(nome);
        this.cucina = cucina;
    }

    /**
     * Metodo eseguito quando il thread dello chef viene avviato.
     * Chiama il metodo usoCucina sulla cucina condivisa.
     */
    @Override
    public void run() {
        cucina.usoCucina(getName());
    }
}
