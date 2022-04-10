package day31_Constructors;

public class RectangleObjects {
    public static void main(String[] args) {

      Rectangle rectangle1 = new Rectangle(5.5, 3.5);
      Rectangle rectangle2  = new Rectangle(10.5, 8.5);

        System.out.println(rectangle1);
        System.out.println(rectangle2);


        double totalArea = rectangle1.calculateArea()+ rectangle2.calculateArea();
        System.out.println("totalArea = " + totalArea);



    }
}
