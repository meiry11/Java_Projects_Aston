package fr.exo07;

public class Door implements IHouse {

    private String color;

    public Door(String color) {
        this.setColor (color);
    }

    private void setColor(String color) {
    }

    @Override
    public String Display() {
        
        return "je suis une porte , ma couleur est" + color;
    }

    @Override
    public Door getDoor() {
return this;
    }
}
