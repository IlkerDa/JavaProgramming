package day35_Encapsulation.encapsulation;

public class CircleObjects {
    public static void main(String[] args) {
        Circle c1 = new Circle(10);
        c1.getRadius();
        c1.setRadius(1);
        double area = c1.calcArea(2);
        System.out.println(c1);
        System.out.println(area);
    }
}
