package fr.functions;

import java.util.Scanner;

/**
 *
 */
public class Tools {

    public static int saisirNombre(){
        Scanner scanner = new Scanner(System.in);

        int nombre= scanner.nextInt();


        return nombre;
    }

    public static String saisirString(){
        Scanner scanner = new Scanner(System.in);

        String nom= scanner.nextLine();


        return nom;
    }


}
