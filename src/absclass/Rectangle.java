package absclass;

public class Rectangle extends Shape {
    double len, wid;
    public Rectangle(double l, double w){
        this.len = l;
        this.wid = w;
    }

    public void area(){
        System.out.println("The area of the rectangle is " + len * wid);
    }
}
