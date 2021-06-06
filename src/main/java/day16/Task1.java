package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("src/main/java/day16/numbers.txt");
        printResult(file);
    }

    private static void printResult(File file) {

        try {
            Scanner sc = new Scanner(file);
            int numbers = 0;
            String[] arr = sc.nextLine().split(" ");

            for (int i = 0; i < arr.length; i++) {
                numbers += Integer.parseInt(arr[i]);
            }

            double result = numbers / (double) arr.length;
            System.out.printf(result + "--> %.3f", result);

        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден!");
        }
    }
}

