package com.example;

//import java.util.ArrayList;

import java.util.ArrayList;

public class MyExample {

    public static void main(String[] args) {
        // write your code here
        boolean valuesOK = true;
        int limit = Integer.parseInt(args[0]);
//        ArrayList<Integer> newArray = new ArrayList<Integer>();
        int newArray[] = new int[0];
        if (isInteger(args[0])) {
            newArray = new int[limit];
            for (int i = 0; i < limit; i++) {
                if (isInteger(args[i + 1])) {
                    newArray[i] = Integer.parseInt(args[i + 1]);
                    //newArray.add(Integer.parseInt(args[i + 1]));
                } else {
                    valuesOK = false;
                }
            }
        }
        else{
            valuesOK = false;
        }
        if (!valuesOK){
            System.out.print("Parameters are not valid");
        }
        else{
            arrayAverage(newArray);
            System.out.print("Hello World");
        }
    }

    private static boolean isInteger(String value){
        boolean isInt = true;
        try{
            Integer.valueOf(value);
        } catch (NumberFormatException e){
            isInt = false;
        }
        return isInt;
    }
    private static void arrayAverage(int[] myArray) {
        int average = 0;
        for (int i = 0; i < myArray.length; i++) {
            average += myArray[i];
        }
        System.out.print("The array average is = " + average / myArray.length +"\n");
    }
}


