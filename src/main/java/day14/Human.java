package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Human {
    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public static List<Human> parseFileToObjList(File file){
        List<Human> list = new ArrayList<>();

        try {
            Scanner sc = new Scanner(file);

            while(sc.hasNext()) {
                String str = sc.nextLine();
                String[] person = str.split(" ");

                if(Integer.parseInt(person[1]) < 0){
                    throw new IllegalAccessException();
                }

                list.add(new Human(person[0], Integer.parseInt(person[1])));
            }


        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден!");

        } catch (IllegalAccessException e) {
            System.err.println("Некорректный входной файл!");

        }

        return list;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
