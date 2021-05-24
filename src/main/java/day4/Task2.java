package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int max = 0;
        int min = 0;
        int zero_count = 0;
        int zero_sum = 0;
        int mas [] = new int [100];
        Random rand = new Random();

        for(int i = 0; i < 100; i++){
            mas[i] = rand.nextInt(1001);
        }
        for (int x : mas) {
            if(x > max)
                max = x;
            else if(x < min)
                min = x;
            if(x % 10 == 0){
                zero_count++;
                zero_sum += x;
            }
        }
        System.out.println("Max:" + max);
        System.out.println("Min:" + min);
        System.out.println("Count:" + zero_count);
        System.out.println("Sum:" + zero_sum);
    }
}
