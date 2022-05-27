package fr.banque;

public class CompteASeuil extends Compte implements ICompteASeuil {


    private double seuil;

    public CompteASeuil(double seuil, double solde, int numero) throws Exception {
        super(numero, solde);
        this.setSeuil(seuil);
    }

    public double getSeuil() {
        return seuil;
    }



    @Override
    public void retirer(double montant) {
        if (this.solde - montant < this.seuil) ;
        this.solde -= montant;
    }

    @Override
    public String toString() {
        return "CompteASeuil{" +
                "solde=" + solde +
                ", numero=" + numero +
                '}';
    }






    public void setSeuil(double seuil) throws Exception {
        if (this.solde > seuil) throw new Exception("le solde ne peut pas etre superieur au seuil");
        this.seuil = seuil;
    }


}
