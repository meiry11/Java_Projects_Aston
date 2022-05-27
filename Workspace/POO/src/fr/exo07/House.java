package fr.exo07;

public class House implements IHouse{

    private int surface;
    private Door door;

    public House(int surface, String color) {
        this.setSurface (surface);
       this.door = new Door(color);
    }

    public House() {

    }

    public House(int surface, Door door) {
    }

    public int getSurface() {
        return surface;
    }

    public void setSurface(int surface) {
        this.surface = surface;
    }

    public void setDoor(Door door) {
        this.door = door;
    }

    public String Display(){
        return "Je suis une maison, ma surface est " + this.surface + "m2" + getDoor().Display();
    }

    @Override
    public Door getDoor() {
        return door;
    }
}
