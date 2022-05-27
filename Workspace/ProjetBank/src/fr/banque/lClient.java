package fr.banque;

import java.util.List;

public interface lClient {
    public void ajouterCompte(Compte unCompte);
public List<Compte> getComptes();
    public Compte getCompte(int numeroCompte);
}
