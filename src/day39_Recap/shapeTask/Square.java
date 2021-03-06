package day39_Recap.shapeTask;

public class Square extends Shape { // extends etmeden once additional variablelari ekle
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if(side<=0){
            System.err.println("Invalid side: "+ side);
            System.exit(1);
        }
        this.side = side;
    }

    public Square(double side) { // once additional var ve getter setterlari yap en son constructoru yap ki ilave var.lari eklesin
        super("Square");
        setSide(side); // burda basta this ile create etti ama setter ile degistirdim
    }

    @Override
    public double area() {
        return side*side;
    }

    @Override
    public double perimeter() {
        return side*4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side='" + side + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}

/*
Square extends Shape:
	variables:
		side;
	Encapsulate the field
	Add a constructor to set the filed
	area(): side * side
	perimeter(): side * 4
	toString(): side, area, perimeter
 */