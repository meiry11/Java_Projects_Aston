package fr.exo03;

import fr.functions.Tools;

public class Main {
    public static void main(String[] args) {
        System.out.println("saisir un nombre");
        int note1 = Tools.saisirNombre();
        int note2 = Tools.saisirNombre();
        String nom = Tools.saisirString();

        Student student = new Student(nom, note1, note2);
        student.show();
    }
}