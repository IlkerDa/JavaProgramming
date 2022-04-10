package day35_Encapsulation.encapsulation;

public class Circle {
    private double radius;
    public static double pi =3.14;

    public Circle(double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public static double getPi() {
        return pi;
    }

    public void setRadius(double radius) {
        if(radius<=0) {
            return;
        }
        this.radius = radius;
    }

    public static void setPi(double pi) {
        Circle.pi = pi;
    }

    public double calcArea(double radius){
        return radius*radius*pi;
    }

    public double calcPerimeter(double radius){
        return radius*2*pi;
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
