package fr.mc5;

import java.util.Scanner;

public class exo5 {
    public static void main(String[] args){


        int [] notes = { 0,1,2,3,4,5,6,7,8,9,10,15,16,17,20,13,24} ;

        for (int i=0;i<notes.length;i++){
            int note = notes[i];

            if(note>=0 && note<=4){
                System.out.println("Catastrophique,il faut revoir");

            } else if (note<=10) {
                System.out.println("insuffisant");
            }else if (note<=14) {
                System.out.println("Peux mieux faire");
            }else if (note<=17) {
                System.out.println("Bien");
            }else if(note<=20)  {
                System.out.println("bon travail");
            }else {
                System.out.println("la note n'est pas comprise");
            }
        }

    }
}
