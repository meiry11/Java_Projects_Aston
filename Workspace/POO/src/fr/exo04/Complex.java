package fr.exo04;

public class Complex {
    int reel;

    int img;


    public Complex(int reel, int img) {
        this.reel = reel;

        this.img = img;

    }

    public void  somme(Complex complex){
        System.out.println("La somme est:"+(this.reel+complex.reel)+"+"+(this.img+complex.img)+"i");

    }


}
