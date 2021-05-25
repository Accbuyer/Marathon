package day5;

public class Task1 {
    public static void main(String[] args) {
    Car car = new Car();
    car.setCarModel("BMW");
    car.setColor("black");
    car.setYearOfIssue(2006);

        System.out.println("Модель автомобиля: " + car.getCarModel() + ", цвет: " + car.getColor()+ ", год выпуска: " + car.getYearOfIssue());

    }
}
