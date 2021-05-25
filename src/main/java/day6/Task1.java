package day6;



public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setCarModel("BMW");
        car.setColor("black");
        car.setYearOfIssue(2006);

        car.info();
        System.out.println(car.yearDifference(2021));


    }
}
