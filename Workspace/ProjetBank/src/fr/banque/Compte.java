package fr.banque;

import java.util.Objects;

public class Compte implements ICompte {

    protected int numero;
    protected double solde;

    public Compte(int numero, double solde) throws Exception {
        this.numero = numero;
        this.solde = solde;
    }

    public int getNumero() {
        return numero;
    }

    private void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSolde() {
        return solde;
    }

    private void setSolde(double solde) throws Exception {
        if (solde < 0) throw new Exception("un solde ne peut pas eutre negatif");
        this.solde = solde;
    }


    @Override
    public void ajouter(double montant) {
        this.solde += montant;


    }


    public void retirer(double montant) {
        if (this.solde > montant) {
            this.solde -= montant;
        }


        }




    @Override
    public String toString() {
        return "Compte{" +
                "numero=" + numero +
                ", solde=" + solde +
                '}';
    }
}



