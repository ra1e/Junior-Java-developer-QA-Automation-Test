package com.company;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList <IShape> objectList = new ArrayList<>();
        int rndList= RandomSmth.RandomList();
          for(int i=0; i<rndList; i++) {
              int rndObj = RandomSmth.RandomObject();


              if (rndObj==1) {
                  Square square = new Square();
                  objectList.add(square);
              }else if (rndObj == 2){
                  Triangle triangle = new Triangle();
                  objectList.add(triangle);
              }else if (rndObj == 3){
                  Circle circle = new Circle();
                  objectList.add(circle);
              }else if (rndObj == 4){
                  Trapeze trapeze = new Trapeze();
                  objectList.add(trapeze);
              }
          }
          
          for(int i=0; i<rndList; i++ ){
              objectList.get(i).output();
          }


    }


}

