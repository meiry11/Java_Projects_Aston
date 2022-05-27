package fr.jeuDés;

import java.util.List;

public class Gobelet implements IGobelet {

    private int valeur;
    private List<Dé> des;


    // C'est un constructeur.
    public Gobelet(List<Dé> des) {
        this.setValeur();
        this.setDes(des);
    }

    public int getValeur() {
        return this.valeur;
    }

    public void setValeur() {
        this.valeur = valeur;
    }

    public List<Dé> getDes() {

        return des;
    }

    public void setDes(List<Dé> des) {
        this.des = des;
    }


    @Override
    // Méthode utilisée pour lancer les dés.
    public void lancer() {
        this.setValeur();
        for (Dé de : des) {
            de.lancer();
            this.valeur += de.getValeur();
        }


    }

    /**
     * > Cette fonction imprime la valeur de la tasse
     */
    public void afficher_score() {
        System.out.println("valeur du gobelet: " +this.valeur);

    }
}
