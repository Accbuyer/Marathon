package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {


        try {
            File file = new File("src/main/resources/shoes.csv");
            Scanner sc = new Scanner(file);

            File fout = new File("src/main/resources/missing_shoes.txt");
            PrintWriter pw = new PrintWriter(fout);

            while (sc.hasNextLine()) {
                String str = sc.nextLine();
                String[] shoes = str.split(";");

                if (Integer.parseInt(shoes[2]) == 0) {
                    pw.println(shoes[0] + "; " + shoes[1] + "; " + shoes[2]);
                }
            }
            pw.close();

        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден!");

        }


    }
}
