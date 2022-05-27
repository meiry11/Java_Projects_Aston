package fr.mc2;

import java.util.Scanner;

public class exo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("saisir le prix de fabrication");
        int prixFabrication = scanner.nextInt();
        System.out.println("saisir le prix de vente");
        int prixVente = scanner.nextInt();
        int difference = prixVente - prixFabrication;

        if (prixFabrication < 0) {
            System.out.println("veuillez entrer un nombre positif");
        } else  if (prixVente < 0){

                System.out.println("veuillez entrer un nombre positif");
                 } else {
                          if (difference > 0) {
                             System.out.printf("profit de %d €", difference);
                         } else {
                                System.out.printf("perte de %d € ", -difference);

                         }
                      }
                 }
    }

