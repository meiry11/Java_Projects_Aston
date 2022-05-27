package fr.mc3;

import java.util.Scanner;

public class exo4 {
    public static void main(String[] args){
        int max;
        Scanner scanner = new Scanner(System.in);
        System.out.println("saisir nombre1");
        int nombre1 = scanner.nextInt();
        System.out.println("saisir nombre2");
        int nombre2 = scanner.nextInt();
        System.out.println("saisir nombre3");
        int nombre3 = scanner.nextInt();

        if(nombre1 > nombre2 && nombre1 > nombre3){
            max = nombre1;
            System.out.println(max);
        } else if (nombre2>nombre3) {
            max = nombre2;
            System.out.println(max);
        }
        else {
            max = nombre3;
            System.out.println(max);
        }
    }
}
