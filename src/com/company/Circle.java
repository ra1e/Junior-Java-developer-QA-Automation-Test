package com.company;

public class Circle implements IShape {
    float radius = RandomSmth.RandomSize();
    String color = RandomSmth.RandomColor();
    double area = radius*radius*Math.PI;

    public float getRadius(){return radius;}
    public  String getColor(){return color;}
    public double getArea(){return area;}

    public void output(){
        System.out.println("Shape: circle, radius length: "+ getRadius()+", color: "+ getColor()+", area: " + getArea() + ".");
    }
    public void draw(){
        System.out.println("Drawing circle");
    }
}
