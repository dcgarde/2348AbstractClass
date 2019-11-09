package absclass;

abstract class Shape {
    abstract void area();
}

class Rectangle extends Shape {
    public void area(){
        System.out.println("The area of the rectangle is 10");
    }
}

class Circle extends Shape {
    public void area(){
        System.out.println("The area of the circle is 4.32");
    }
}

class Square extends Shape {
    public void area() {
        System.out.println("The area of the square is 15.");
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Circle circle = new Circle();
        Square square = new Square();

        rectangle.area();
        circle.area();
        square.area();
    }

}
