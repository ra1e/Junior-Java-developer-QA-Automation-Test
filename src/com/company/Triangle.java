package com.company;

public class Triangle implements IShape {
    float firstCathet = RandomSmth.RandomSize();
    float secondCathet = RandomSmth.RandomSize();
    double hypotenuse = Math.sqrt(Math.pow(firstCathet, 2) + Math.pow(secondCathet, 2) );
    String color = RandomSmth.RandomColor();
    float area = (firstCathet*secondCathet)/2;

    public float getFirstCathet(){
        return firstCathet;
    }
    public float getSecondCathet(){
        return secondCathet;
    }
    public double getHypotenuse(){
        return hypotenuse;
    }
    public String getColor(){
        return color;
    }
    public double getArea(){ return area; }

    public void output(){
        System.out.println("Shape: triangle, first cathet length: "+ getFirstCathet()+ ", second cathet length: "+ getSecondCathet()+", hypotenuse length: "+ getHypotenuse() + ", color: "+ getColor()+", area: " + getArea() + ".");
    }
    public void draw(){
        System.out.println("Drawing triangle");
    }
}
