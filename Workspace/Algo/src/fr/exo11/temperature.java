package fr.exo11;

import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] temperatures = {12, 8, 3, -1,6};
        int minPositif = 0;
        int minNegatif = 0;

        for (int i = 0; i <= temperatures.length; i++) {
            if (temperatures[i] > 0 && temperatures[i+1]>0) {
                if (temperatures[i] < temperatures[i+1]) {
                    minPositif = temperatures[i];
                }else {
                    minPositif = temperatures[i+1];
                }
                temperatures[i+1] = temperatures[i];
            }


            else {

                if (temperatures[i] > temperatures[i + 1]) {
                    minNegatif = temperatures[i];
                }else {
                    minNegatif = temperatures[i+1];
                }

            }
            if (Math.abs(minNegatif) < Math.abs(minPositif)) {
                System.out.println(minNegatif);
            }



        }

    }
}
