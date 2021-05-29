package day9.Task2;

public class Triangle extends Figure{
    private int side1;
    private int side2;
    private int side3;

    public Triangle(int side1, int side2, int side3, String color) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double area() {
        double semiPerimeter = (side1 + side2 + side3) / 2.0;
        return Math.sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3));
    }

    @Override
    public double perimeter() {

        return side1 + side2 + side3;
    }
}
