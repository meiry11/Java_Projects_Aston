import java.util.Scanner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JavaTest {
    public static void main(String[] args) {
        // En utilisant les tableaux
        int[] tab = { 12, 25, -5, 6, 5 };

        for(int num : tab) {
            // Pour chaque temperature du tableau (sauf la derniere)
            for(int index = 0; index < tab.length -1; index++) {
                // Si la temperature est plus grande que celle d'après
                if(tab[index] > tab[index+1]) {
                    // On inverse les places des deux temperatures
                    int temp = tab[index];
                    tab[index] = tab[index+1];
                    tab[index+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(tab));





    }
}
