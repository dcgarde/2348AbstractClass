package absclass;

public class Circle extends Shape {
    double pie = Math.PI, rad;
    public Circle(double r){
        this.rad = r;
    }
    public void area(){
        System.out.println("The area of the circle is " + pie * rad * rad);
    }
}
