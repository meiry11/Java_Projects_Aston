package fr.exo13;

public class FizzBuzz {
    public static void main(String[] args){

        int [] fizzbuzz = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

        for (int i = 0; i < fizzbuzz.length; i++) {
            int nombre = fizzbuzz[i];
            if(nombre%15 == 0){
                System.out.println("FizzBuzz");
            } else if (nombre%5 == 0) {
                System.out.println("Buzz");
            }
            else if(nombre%3 == 0) {
                System.out.println("Fizz");
            }
            else{
                System.out.println(nombre);
            }
        }
    }
}
