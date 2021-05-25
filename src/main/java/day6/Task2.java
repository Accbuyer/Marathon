package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boing", 1995, 63, 70);
        airplane.setLength(66);
        airplane.setYear(1994);
        airplane.fillUp(20);
        airplane.fillUp(50);
        airplane.info();

    }
}
