package com.example;

/**
 * Created by paolacalderon on 7/11/17.
 */
public class Exercise5 {
    public static void main(String[] args) {
        int n;
        int[] array;
        if (validateArgs(args)){
            n = Integer.parseInt(args[0]);
            array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = Integer.parseInt(args[i + 1]);
            }
            System.out.print("El array original es: ");
            printArray(array);
            getInverseArray(array);
        }

    }

    private static void getInverseArray(int[] array){
        int size = array.length;
        for(int i=0;i<size/2;i++){
            int j = size-i-1;
            int temp = array[j];
            array[j] = array[i];
            array[i] = temp;
        }
        System.out.print("El inverso del array es: ");
        printArray(array);
    }

    private static void printArray(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.print(" "+array[i]);
        }
        System.out.println();
    }

    private static boolean validateArgs(String[] args){
        boolean valuesOK = true;
        int limit = Integer.parseInt(args[0]);
        if (isInteger(args[0])) {
            for (int i = 0; i < limit; i++) {
                if (!isInteger(args[i + 1])) {
                    valuesOK = false;
                }
            }
        }
        else{
            valuesOK = false;
        }
        return valuesOK;
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


}
