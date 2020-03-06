package com.company;

public class Square implements IShape {

    float firstSide = RandomSmth.RandomSize();
    double diagonal = Math.sqrt(Math.pow(firstSide, 2) + Math.pow(firstSide, 2) );
    String color = RandomSmth.RandomColor();
    double area = Math.pow(firstSide,2);

    public float getFirstSide(){
        return firstSide;
    }
    public double getDiagonal(){
        return diagonal;
    }
    public String getColor(){
        return color;
    }
    public double getArea(){ return area; }

    public void output(){
        System.out.println("Shape: square, side length: "+ getFirstSide()+ ", diagonal length: "+ getDiagonal() + ", color: "+ getColor()+", area: " + getArea() + ".");
    }
    public void draw(){
        System.out.println("Drawing square");
    }
}
