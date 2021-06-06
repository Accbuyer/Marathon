package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Random rnd = new Random();
        try {
            PrintWriter pw1 = new PrintWriter("src/main/java/day16/file1.txt");
            PrintWriter pw2 = new PrintWriter("src/main/java/day16/file2.txt");

            for (int i = 0; i < 1000; i++) {
                pw1.println(rnd.nextInt(100));
            }
            pw1.close();

            File file = new File("src/main/java/day16/file1.txt");
            Scanner sc = new Scanner(file);
            int counter = 0;
            int sum = 0;

            while (sc.hasNextLine()) {
                sum += Integer.parseInt(sc.nextLine());
                counter++;

                if (counter == 20) {
                    pw2.println(sum / (double) counter);
                    sum = 0;
                    counter = 0;
                }
            }
            pw2.close();
            printResult(file);

        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден!");
        }
    }

    private static void printResult(File file) {
        try {
            Scanner sc = new Scanner(file);
            int sum = 0;

            while (sc.hasNextLine()) {
                sum += Integer.parseInt(sc.nextLine());
            }
            System.out.println(sum);
        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден!");
        }
    }
}
