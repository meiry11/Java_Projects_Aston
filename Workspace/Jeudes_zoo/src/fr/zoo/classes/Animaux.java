package fr.zoo.classes;

import fr.zoo.interfaces.IAnimal;

abstract public class Animaux implements IAnimal {

    static public int count;

    public Animaux(int count) {
        count++;
    }

    @Override
    public void manger() {
        System.out.println("l'animal mange");
    }
}
