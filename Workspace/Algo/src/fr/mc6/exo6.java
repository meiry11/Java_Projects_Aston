package fr.mc6;

import java.util.Scanner;

public class exo6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("veuillez entrer votre premier operande");
        Double operande1 = scanner.nextDouble();
        System.out.println("veuillez entrer votre opereteur");
        String operateur = scanner.next();
        System.out.println("veuillez entrer votre deuxieme operande");
        Double operande2 = scanner.nextDouble();

        String[] operateurs = {"+", "*", "/", "-"};
        Double resultat1 = operande1 + operande2;
        Double resultat2 = operande1 / operande2;
        Double resultat3 = operande1 * operande2;
        Double resultat4 = operande1 - operande2;

        for (int i = 0; i < operateurs.length; i++) {
            operateur = operateurs[i];


           /** if (operateur.equals("+")) {
                System.out.println("[" + operande1 + operateur + operande2 + "]" + "=" + resultat1);
            } else if (operateur.equals("/")) {
                System.out.println("[" + operande1 + operateur + operande2 + "]" + "=" + resultat2);
            } else if (operateur.equals("*")) {
                System.out.println("[" + operande1 + operateur + operande2 + "]" + "=" + resultat3);
            } else if (operateur.equals("-")) {
                System.out.println("[" + operande1 + operateur + operande2 + "]" + "=" + resultat4);
            } else {
                System.out.println("veuillez saisir un bon operateur");
            }*/
            if (operateur.equals("+")) {
                System.out.println("[" + operande1 + operateur + operande2 + "]" + "=" + resultat1);
            } else if (operateur.equals("/")) {
                System.out.println("[" + operande1 + operateur + operande2 + "]" + "=" + resultat2);
            } else if (operateur.equals("*")) {
                System.out.println("[" + operande1 + operateur + operande2 + "]" + "=" + resultat3);
            } else if (operateur.equals("-")) {
                System.out.println("[" + operande1 + operateur + operande2 + "]" + "=" + resultat4);
            } else {
                System.out.println("veuillez saisir un bon operateur");
            }
        }
    }
}


