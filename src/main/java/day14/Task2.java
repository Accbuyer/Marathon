package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static List<String> parseFileToStringList(File file){
        List<String> list = new ArrayList<>();
        try {
            Scanner sc = new Scanner(file);

            while(sc.hasNext()) {
                String str = sc.nextLine();
                String[] person = str.split(" ");

                if(Integer.parseInt(person[1]) < 0){
                    throw new IllegalAccessException();
                }

                list.add(person[0] + " " + person[1]);
            }

            return list;

        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден!");

        } catch (IllegalAccessException e) {
            System.err.println("Некорректный входной файл!");
            return new ArrayList<>();
        }
        return list;
    }
    public static void main(String[] args) {
        System.out.println(parseFileToStringList(new File("src/main/java/day14/people.txt")));

    }
}
