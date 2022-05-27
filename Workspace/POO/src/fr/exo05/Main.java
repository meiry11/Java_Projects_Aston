package fr.exo05;

import fr.functions.Tools;

public class Main {
    public static void main(String[] args){
        System.out.println("saisir abxisse point1");
        int x1 = Tools.saisirNombre();
        System.out.println("saisir ordonnée point1");
        int y1 = Tools.saisirNombre();
        System.out.println("saisir abxisse point2");
        int x2 = Tools.saisirNombre();
        System.out.println("saisir ordonnée point2");
        int y2 = Tools.saisirNombre();

        Points p1 = new Points(x1,y1);
        Points p2 = new Points(x2,y2);

        System.out.printf("%.5f",p1.distance(p2));
    }
}
