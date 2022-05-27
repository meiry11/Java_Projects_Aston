package fr.exo03;

public class Student {
    String nom;
    int[] notes;

    public Student(String nom, int... notes) {
        this.nom = nom;
        this.notes = notes;
    }

    /**
     * la methode pour calculer la moyenne
     * @return
     */
    public double calcAverage(){

        double resultat =0;

        for(int note: this.notes){
            resultat += note;
        }
        resultat/= this.notes.length;
        return resultat;
    }

    /**
     * la methode pour retourner le nom et la moyenne
     */
    public  void show(){
        System.out.println("le nom est: "+nom+" et la moyenne est : "+calcAverage());
    }
}
