package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mas [] = new int [n];
        Random rand = new Random();

        for(int i = 0; i < n; i++){
            mas[i] = rand.nextInt(11);
        }
        System.out.println( Arrays.toString(mas));
        System.out.println("Длина массива: " + mas.length);
        System.out.println("Количество чисел больше 8: " + Arrays.stream(mas).filter(x -> x > 8).count());
        System.out.println("Количество чисел равных 1: " + Arrays.stream(mas).filter(x -> x == 1).count());
        System.out.println("Количество чётных чисел: " + Arrays.stream(mas).filter(x -> x % 2 == 0).count());
        System.out.println("Количество нечётных чисел: " + Arrays.stream(mas).filter(x -> x % 2 != 0).count());
        System.out.println("Сумма всех элементов массива: " + Arrays.stream(mas).reduce((acc, x) -> acc + x).getAsInt());
    }
}
