package com.example;

/**
 * Created by paolacalderon on 7/11/17.
 */
public class Exercise6 {
    public static void main(String[] args) {
        String palindrome= args[0];
        System.out.println("El string es: "+palindrome);
        boolean isP = isPalindrome(palindrome);
        if (isP){
            System.out.print("El string es palindromo");
        } else {
            System.out.print("El string NO es palindromo");
        }
    }

    private static boolean isPalindrome(String palindrome){
        int size = palindrome.length();
        char[] array = palindrome.toCharArray();
        boolean isP = true;
        for(int i=0;i<size/2;i++){
            int j = size-i-1;
            if(array[i] != array[j]){
                isP = false;
            }
        }
        return isP;
    }

//    private static void printArray(int[] array){
//        for (int i = 0; i < array.length; i++){
//            System.out.print(" "+array[i]);
//        }
//        System.out.println();
//    }

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
