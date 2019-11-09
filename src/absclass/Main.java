package absclass;

public class Main {
    public static void main(String[] args) {
        Shape s1 = new Rectangle(4,3);
        Shape s2 = new Circle(3);
        Shape s3 = new Square(5);

        s1.area();
        s2.area();
        s3.area();
    }

}
