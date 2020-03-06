package com.company;

public class Trapeze implements IShape {
    RandomSmth TrapezeDesc = new RandomSmth();
    float topBase = RandomSmth.RandomSize();
    float botBase = RandomSmth.RandomSize();
    float height = RandomSmth.RandomSize();
    double side = Math.sqrt(Math.pow(((topBase - botBase)/2),2)+Math.pow(height, 2));
    double area = ((topBase + botBase)/2)*height;
    String color = RandomSmth.RandomColor();

    public float getTopBase(){ return topBase;}
    public float getBotBase(){ return botBase;}
    public float getHeight(){ return height;}
    public double getSide(){ return side;}
    public double getArea(){ return area;}
    public String getColor(){ return color;}

    public void output(){
        System.out.println("Shape: triangle, top base length: "+ getTopBase()+ ", bottom base length: "+ getBotBase()+", height length: "+ getHeight() + ", side length:"+ getSide() +", color: "+ getColor()+", area: " + getArea() + ".");
    }
    public void draw(){
        System.out.println("Drawing trapeze");
    }
}
