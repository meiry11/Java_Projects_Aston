package fr.jeuDés;

public interface IPartie {
    public void initialiser(Joueur joueur);
    public void lancer();
    public void afficherGagnant(Joueur gagnant);

}
