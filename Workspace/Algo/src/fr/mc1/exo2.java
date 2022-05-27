package fr.mc1;

import java.util.Scanner;

public class exo2 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){

        int nombre1=0;
        int nombre2=0;
        int somme =0;
        System.out.println("veuillez entrer nombre1");
         nombre1 = scanner.nextInt();
        System.out.println("veuillez entrer nombre2");
        nombre2 = scanner.nextInt();
        somme = nombre1+nombre2;
        System.out.println(+  nombre1 + " + " +nombre2+ " = " +somme);


    }
}
