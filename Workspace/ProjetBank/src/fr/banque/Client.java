package fr.banque;

import java.util.ArrayList;
import java.util.List;

public class Client implements lClient {

    private String nom;
    private String prenom;
    private int age;
    private int numero;

    private List<Compte> tabCompte = new ArrayList<>();



    public Client(String nom, String prenom, int age, int numero) throws Exception {
        this.setAge(age);
        this.setPrenom(prenom);
        this.setNom(nom);
        this.numero = numero;


    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }





    @Override
    public String toString() {
        return "Client{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", age=" + age +
                ", numero=" + numero +

                '}';
    }

    @Override
    public void ajouterCompte(Compte unCompte) {
        if ( this.tabCompte.size()> 5) {
            this.tabCompte.add(unCompte);
        }
    }

    public List<Compte> getComptes(){
        return this.tabCompte;
    }

    public Compte getCompte(int nuNUm){
        Compte result = null;
        for (Compte compte: tabCompte) {
            if(nuNUm == compte.getNumero())
                result = compte;
        }
        return result;
    }




}
