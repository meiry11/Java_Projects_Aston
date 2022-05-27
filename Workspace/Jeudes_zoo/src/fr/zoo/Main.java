package fr.zoo;

import fr.zoo.classes.Animaux;
import fr.zoo.classes.Chat;
import fr.zoo.classes.Dauphin;
import fr.zoo.classes.Zoo;

public class Main {
    public static void main(String[] args) throws Exception {

        Chat chat = new Chat();
        Dauphin dauphin = new Dauphin();

        Zoo zoo = new Zoo();
        zoo.getListeCage().get(0).ajouter(chat);
        zoo.getListeAquarium().get(0).ajouter(dauphin);

        zoo.getListeCage().get(0).checkConteneur();
        System.out.println("nombre d'animaux dans le zoo : " + Animaux.count);
    }
}

