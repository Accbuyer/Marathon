package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike(1994, "white", "Yamaha");

        System.out.println("Модель мотоцикла: " + motorbike.getMotorbikeModel() + ", цвет: "
                + motorbike.getColor()+ ", год выпуска: " + motorbike.getYearOfIssue());


    }
}
