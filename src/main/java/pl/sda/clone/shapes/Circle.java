package pl.sda.clone.shapes;

public class Circle extends Shape{

    private double radius = 0;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return PI*radius*radius;
    }

    @Override
    public double perimeter() {
        return 2*PI*radius;
    }

    @Override
    public void printName() {
        System.out.println("Jestem Circle!");
    }

    public void printDiameter(){
        System.out.println("Srednica = " + 2 * this.radius);
    }
}
