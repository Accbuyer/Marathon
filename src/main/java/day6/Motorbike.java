package day6;

public class Motorbike {
    private int yearOfIssue;
    private String color;
    private String motorbikeModel;

    public Motorbike(int yearOfIssue, String color, String motorbikeModel) {
        this.yearOfIssue = yearOfIssue;
        this.color = color;
        this.motorbikeModel = motorbikeModel;
    }

    public void info(){ System.out.println("Это мотоцикл"); }

    public int yearDifference(int inputYear){
        return Math.abs(inputYear - yearOfIssue);
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
