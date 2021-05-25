package day6;

public class Car {
    private int yearOfIssue;
    private String color;
    private String carModel;

    public void info(){ System.out.println("Это автомобиль"); }

    public int yearDifference(int inputYear){
        return Math.abs(inputYear - yearOfIssue);
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }
}
