package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        double divisible;
        double divisor;
        Scanner sc = new Scanner(System.in);

        while(true){
        divisible = sc.nextDouble();
        divisor = sc.nextDouble();

        if(divisor == 0)
            break;

            System.out.println(divisible/divisor);
        }

    }
}
