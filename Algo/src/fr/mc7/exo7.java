package fr.mc7;

import java.util.Scanner;

public class exo7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("veuillez saisir un nombre");
        int nombre = scanner.nextInt();
        int resultat = 0;
        String result = "";
        for (int i = 1; i <= nombre; i++) {


            if (i == nombre) {
                result += i;
            } else {
                result += i + "+";

            }
            resultat = resultat + i;
        }
        System.out.println(result +"=" + resultat);
    }
}
