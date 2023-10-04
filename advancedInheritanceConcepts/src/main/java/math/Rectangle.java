package math;

import math.Shape;

public class Rectangle extends Shape {
    public double Length;
    public double Width;

    @Override
    public double area() {

        return Length*Width;
    }

    @Override
    public double perimeter() {
        return 2*(Length+Width);
    }
}
