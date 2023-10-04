package math;
import java.math.*;


public class Circle extends Shape{
    public double Radius;
    @Override
    public double area() {
        return Math.PI * Radius * Radius;
    }

    @Override
    public double perimeter() {
        return 2*Math.PI*Radius;
    }

}
