package day9.Task2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TestFigures {
    public static double calculateRedPerimeter(Figure[] figures){
//        Arrays.stream(figures).filter(x -> x.getColor().equals("Red")).reduce((acc, x) ->  acc + x.perimeter());

        double perimeter = 0;
        for (int i = 0; i < figures.length; i++) {
            if(figures[i].getColor().equals("Red"))
                perimeter += figures[i].perimeter();


        }
        return perimeter;

    }
    public static double calculateRedArea(Figure[] figures){
        double area  = 0;
        for (int i = 0; i < figures.length; i++) {
            if(figures[i].getColor().equals("Red"))
                area += figures[i].area();
        }
        return area;
    }
    public static void main(String[] args) {
        Figure[] figures = {
                new Triangle(10, 10, 10, "Red"),
                new Triangle(10, 20, 30, "Green"),
                new Triangle(10, 20, 15, "Red"),
                new Rectangle(5, 10, "Red"),
                new Rectangle(40, 15, "Orange"),
                new Circle(4, "Red"),
                new Circle(10, "Red"),
                new Circle(5, "Blue")
        };

        System.out.println(calculateRedPerimeter(figures));
        System.out.println(calculateRedArea(figures));



    }

}
