package day5;

public class Motorbike {
    private int yearOfIssue;
    private String color;
    private String motorbikeModel;

    public Motorbike(int yearOfIssue, String color, String motorbikeModel) {
        this.yearOfIssue = yearOfIssue;
        this.color = color;
        this.motorbikeModel = motorbikeModel;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public String getColor() {
        return color;
    }

    public String getMotorbikeModel() {
        return motorbikeModel;
    }
}
