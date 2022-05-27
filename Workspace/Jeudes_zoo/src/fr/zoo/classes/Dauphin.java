package fr.zoo.classes;

import fr.zoo.interfaces.INageur;

public class Dauphin extends Animaux implements INageur {

    public Dauphin() {
        super(count);
    }

    @Override
    public void nager() {
        System.out.println("le dauphin nage");
    }
}
