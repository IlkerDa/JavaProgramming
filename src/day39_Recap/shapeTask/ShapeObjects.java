package day39_Recap.shapeTask;

public class ShapeObjects {
    public static void main(String[] args) {

        Square kare = new Square(10);
        System.out.println(kare);
       // kare.side = -1111111;
       // kare.setSide(-9999);
        kare.setSide(11);
        System.out.println(kare);
        System.out.println("------------------------");

        Rectangle dikdortgen = new Rectangle(5,6);
        dikdortgen.setLength(10);
        System.out.println(dikdortgen);
        System.out.println(dikdortgen.getLength());
       // System.out.println(dikdortgen.name); name var. private o yuzden erismedik
        System.out.println(dikdortgen.getName() );
        System.out.println("------------------------");

        Circle daire = new Circle(7.5);
        System.out.println(daire);
        daire.setRadius(15.5);
        System.out.println(daire.getRadius());
        System.out.println(daire);
        System.out.println(daire.getName());




    }
}
