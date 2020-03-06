package com.company;

public class RandomSmth {
    public static float RandomSize(){
        int min = 1;
        int max = 10;
        float randomNumber = min + (float) (Math.random() * max);
        return randomNumber;
    }

    public static String RandomColor(){
        String[] colors = {"red", "green", "blue", "yellow", "magenta", "cyan"};
        int r = (int) (Math.random() * (colors.length));
        return colors[r];
    }

    public static int RandomObject(){
        int min = 1;
        int max = 4;
        int randomNum = min + (int) (Math.random() * max);
        return randomNum;
    }

    public static int RandomList(){
        int min = 1;
        int max = 100;
        int randomList = min + (int) (Math.random() * max);
        return randomList;
    }
}
