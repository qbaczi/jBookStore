package pl.sda.clone.shapes;

public class Square extends Shape{

    private double side = 0;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side*side;
    }

    @Override
    public double perimeter() {
        return 4*side;
    }

    @Override
    public void printName() {
        System.out.println("jestem square");
    }
}
