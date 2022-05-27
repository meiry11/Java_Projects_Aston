package fr.exo04;

import fr.functions.Tools;

public class Main {
    public static void main(String[] args) {
        System.out.println("saisir partie reelle 1");
        int reel = Tools.saisirNombre();
        System.out.println("saisir partie reelle 2");
        int reel1 = Tools.saisirNombre();

        System.out.println("saisir partie imaginaire 1");
        int img = Tools.saisirNombre();
        System.out.println("saisir partie imaginaire 2");
        int img1 = Tools.saisirNombre();


        Complex maComplex1 = new Complex(reel, img);
        Complex maComplex2 = new Complex(reel1, img1);

        maComplex1.somme(maComplex2);

    }


}
