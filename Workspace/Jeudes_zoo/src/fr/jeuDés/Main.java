package fr.jeuDés;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
       Dé de = new Dé();
       de.lancer();
        System.out.println(de);

        Scanner scan = new Scanner(System.in);
        List<Dé> listeDe = new ArrayList<Dé>();


        System.out.println("nombre de dés ? ");
        int nbd = scan.nextInt();

        for (int i = 0; i < nbd; i++) {
            listeDe.add(new Dé());
        }

        Gobelet gob = new Gobelet(listeDe);

        System.out.println("nombre de tour ?");
        int nbt = scan.nextInt();

        Partie partie = new Partie(nbt, gob);

        System.out.println("nombre de joueur ? ");
        int nbj = scan.nextInt();

        for (int i = 0; i < nbj; i++) {
            System.out.println("nom du joueur : ");
            String nom = scan.next();
            partie.initialiser(new Joueur(nom));
        }
        scan.close();


        partie.lancer();

    }






    }

