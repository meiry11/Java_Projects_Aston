package fr.exo01;
import java.util.Scanner;
public class Bienvenue {
    private static Scanner monScanner = new Scanner(System.in);

    public static void main(String[] args) {
        String nom;
        String prenom;

        System.out.println("veuillez saisir votre nom");
        nom = monScanner.nextLine();
        System.out.println("veuillez saisir votre prenom");
        //nextLine permet de recuperer toute la ligne suivante
        prenom = monScanner.nextLine();
        System.out.printf("bonjour %s !!!",nom,prenom);

    }



}
