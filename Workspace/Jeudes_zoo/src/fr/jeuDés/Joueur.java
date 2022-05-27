package fr.jeuDés;

public class Joueur implements IJoueur{

    private String nom;
    private int score;

    public Joueur(String nom) {
        this.setNom (nom);
        this.score = 0;

    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
        this.score = score;
    }

    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public void jouer(Gobelet gobelet) {
        gobelet.lancer();
        this.score += gobelet.getValeur();
        gobelet.afficher_score();

    }

    @Override
    public void afficher_score() {
        System.out.println("le score de " + this.nom + " est de : " + this.score + System.getProperty("line.separator"));
    }
}
