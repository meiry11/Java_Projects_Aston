package fr.exo07;

public class Person implements IHouse{

    private String nom;
    House house;


    public Person(String nom) {
        this.nom = nom;
        this.house = house;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    @Override
    public String Display() {
        return "Je m'appelle" + this.nom  ;
    }

    @Override
    public Door getDoor() {

        return null;
    }
}
