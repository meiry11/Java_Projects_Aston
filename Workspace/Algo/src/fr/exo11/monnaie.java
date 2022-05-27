package fr.exo11;

import java.util.Scanner;

public class monnaie {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("saisir un nombre");
        double nombre = scanner.nextDouble();
        double [] monnaies = { 500,200,20,10,5,2,0.50,0.05,0.02};


        for (int i = 0; i <= monnaies.length ; i++) {
            double quotient =Math.floor (nombre/monnaies[i]);
    if (monnaies[i]>=5){
        System.out.println("Billet " + monnaies[i]+ ":" + quotient );
    }else{
        System.out.println("Pieces " + monnaies[i]+ ":" + quotient );
    }

             nombre = nombre - (quotient*monnaies[i]);


        }
    }
}
