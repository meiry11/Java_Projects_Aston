package fr.exo02;

import fr.functions.Tools;

public class Main {
    public static void main(String[] args) {
        System.out.println("saisir un nombre");
        int n1 = Tools.saisirNombre();
        int n2 = Tools.saisirNombre();
        Somme somme = new Somme(n1, n2);
        System.out.println(somme.sum());
    }
}
