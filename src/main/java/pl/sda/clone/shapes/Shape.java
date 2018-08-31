package pl.sda.clone.shapes;

public abstract class Shape {

    public static final double PI = 3.14;

    public abstract double area();

    public abstract double perimeter();

    public void printName(){
        System.out.println("Jestem");
    }

}
