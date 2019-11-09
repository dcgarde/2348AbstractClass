package absclass;

public class Square extends Shape {
    double side;
    public Square(double s){
        this.side = s;
    }

    public void area() {
        System.out.println("The area of the square is " + side * side);
    }
}
