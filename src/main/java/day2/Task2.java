package day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner sc = new Scanner(System.in);

        while(true){
            a = sc.nextInt();
            b = sc.nextInt();
            if(a < b)
                break;
            System.out.println("Неккоректный ввод");
        }

        for (int i = a + 1; i < b; i++) {

            if(i % 5 == 0 && i % 10 != 0)
                System.out.println(i);
        }

    }
}
