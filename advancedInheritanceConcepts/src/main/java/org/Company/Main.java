package org.Company;
import math.Circle;
import math.Rectangle;
import math.Shape;

public class Main {
    public static void main(String[] args) {
        Circle circle1=new Circle();
        circle1.Radius=8;
        Rectangle rectangle1=new Rectangle();
        rectangle1.Length=6;
        rectangle1.Width=5;
        Shape[]arrayS={circle1,rectangle1};//Array of subclass objects
        System.out.println(circle1.toString());
    }
}