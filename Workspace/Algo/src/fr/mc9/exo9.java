package fr.mc9;

import java.util.Scanner;


public class exo9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("veillez saisir un nombre");
        int nombre = scanner.nextInt();

        String etoile = "";
        for (int i = 1; i <= nombre; i++) {

            etoile += "*";
            System.out.println(etoile);
        }

        for (int j = 0; j < nombre - 1; j++) {


            etoile = etoile.substring(0, nombre - j);
            System.out.println(etoile);
        }

    }


}


