package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("Введите число этажей");
             number = sc.nextInt();

             if(number > 0) {
                 if(number <= 4)
                     System.out.println("Малоэтажный дом");
                 else if(number <= 8)
                     System.out.println("Среднеэтажный дом");
                 else if(number >= 9)
                     System.out.println("Многоэтажный дом");
                 break;
             }
            System.out.println("Ошибка ввода");
        }

    }
}
