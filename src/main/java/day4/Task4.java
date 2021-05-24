package day4;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int mas [] = new int [100];
        int max = 0;
        int index = 0;
        Random rand = new Random();
        for(int i = 0; i < mas.length; i ++){
            mas[i] = rand.nextInt(10001);
        }

            for (int i = 0; i < mas.length - 2; i++) {

                int temp = mas[i] + mas[i + 1] + mas[i + 2];

                if (temp > max) {
                    max = temp;
                    index = i;
                }
            }

        

        System.out.println(max);
        System.out.println(index);

    }
}
