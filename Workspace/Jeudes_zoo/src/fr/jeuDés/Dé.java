package fr.jeuDés;

import java.util.Random;

public class Dé  implements IDé{
    public int valeur;

     public Dé (){

         this.valeur = 0;
     }

    public int getValeur() {

         return this.valeur;
    }


    @Override
    public int lancer() {
         Random random = new Random();
        this.valeur = random.nextInt((6 - 1) + 1)+ 1;
        return 0;
    }

    @Override
    public String toString() {
        return "Dé{" +
                "valeur=" + valeur +
                '}';
    }
}
