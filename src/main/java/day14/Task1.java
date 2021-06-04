package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task1 {
    public static  void printSumDigits(File file) {
        try {
            Scanner sc = new Scanner(file);
            String str = sc.nextLine();
            String[] numbers = str.split(" ");

            if(numbers.length != 10){
                throw new IllegalAccessException();
            }
            System.out.println((Integer) Arrays.stream(numbers).mapToInt(Integer::parseInt).sum());


        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден!");

        } catch( IllegalAccessException e){
            System.err.println("Некорректный входной файл!");
        }
    }
    public static void main(String[] args) {

        printSumDigits(new File("src/main/java/day14/numbers.txt"));


    }
}
