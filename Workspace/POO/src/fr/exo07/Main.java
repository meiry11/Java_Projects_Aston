package fr.exo07;

public class Main {

    public static void main(String[] args){
        Person person = new Person("Thomas");
person.Display();

House house = new House(50, person.getDoor());
house.Display();

//Door door = new Door();
//door.Display("cv");
    }
}
