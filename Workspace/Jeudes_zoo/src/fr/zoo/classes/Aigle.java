package fr.zoo.classes;

import fr.zoo.interfaces.IVolatile;

public class Aigle extends Animaux implements IVolatile {


    public Aigle() {
        super(count);
    }

    @Override
    public void voler() {
        System.out.println("l'aigle vole");
    }
}
