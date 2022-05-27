package fr.exo10;

import java.util.Scanner;

public class pyramide {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("veuillez saisir un nombre");

       /** int rows = 5, k = 0;

        for (int i = 1; i <= rows; ++i, k = 0) {
            for (int space = 1; space <= rows - i; ++space) {
                System.out.print("  ");
            }

            while (k != 2 * i - 1) {
                System.out.print("* ");
                ++k;
            }

            System.out.println();
        }*/



                System.out.println("saisissez un nombre: ");
                int nbRows = scanner.nextInt();
                int rows = nbRows;
                for (int i = 0; i < rows; ++i) {
                    String espace ="";
                    String etoile ="";
                    for (int j = 0; j < rows - i; j++) {
                        espace += " ";
                    }

                    for (int k=0;k<2*i-1;k++) {
                        etoile += "*";
                    }
                    System.out.println(espace+etoile);
                }

            }
        }







