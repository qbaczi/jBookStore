package pl.sda.clone.shapes;

public class App {
    public static void main(String[] args) {
        Circle circle = new Circle(3);
        circle.printName();
        System.out.println(circle.area());
        Square sqare = new Square(4);
        sqare.printName();
        System.out.println(sqare.area());
        Shape sCircle = new Circle(5);
        ((Circle) sCircle).printDiameter();
    }
}
