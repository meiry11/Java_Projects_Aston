package fr.exo14;

import java.util.Random;
import java.util.Scanner;

public class JustePrix {

    public static void main(String[] args) {
        Random random = new Random();
        int nombreDemande = saisirNombre();
        int value = random.nextInt(nombreDemande);
        System.out.println(value);

        int justePrix = saisirNombre();

        do {


            if (justePrix > value) {
                System.out.println("plus");
                saisirNombre();
            } else if (justePrix < value) {
                System.out.println("Moins");
                saisirNombre();
            }

        } while (justePrix == value);

    }



    public static int saisirNombre() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("saisir un nombre");
        int nombre = scanner.nextInt();
        System.out.println(nombre);
        return nombre;
    }


}
