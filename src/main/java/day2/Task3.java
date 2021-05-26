package day2;

import java.util.Scanner;

public class Task3 {
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

        while(++a < b){

            if(a % 5 == 0 && a % 10 != 0)
                System.out.println(a);

        }


    }
}
