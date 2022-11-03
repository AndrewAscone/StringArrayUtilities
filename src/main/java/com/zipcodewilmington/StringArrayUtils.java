package com.zipcodewilmington;

import com.sun.javafx.binding.StringFormatter;

import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {

        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {

        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {

        return array[array.length - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {

        return array[array.length - 2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for (String i : array){
            if(value.equals(i)){
                return true;
            }
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] newArray = new String[array.length];
        int j = array.length - 1;
        for(int i = 0; i < array.length; i++){
            newArray[i] = "";
            newArray[i] = array[j];
            j--;
        }
        return newArray;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        String[] newArray;
        newArray = reverse(array);

        boolean truth = Arrays.equals(newArray, array);
        System.out.println(truth);

        if(truth){
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        String str = String.join(" ", array).replaceAll(" ", "");
        str = str.toLowerCase();
        System.out.println(str);
//        String alphabet = "abcdefghijklmnopqrstuvwxyz";
//        String result = "";
//
//        for (int i = 0; i <= alphabet.length() - 1; i++){
//            for (int j = 0; j <= str.length() - 1; j++){
//                if(alphabet.indexOf(str.charAt(i)) == str.indexOf(j)){
//
//                    System.out.println(result);
//                    break;
//                }
//            }
//        }
//
//        if(result.equals(alphabet)){
//            return true;
//        }
//        else{
//            return false;
//        }
        boolean[] check = new boolean[26];
        int cell = 0;

        for(int i = 0; i < str.length(); i++)
        {
            if('a'<= str.charAt(i) && str.charAt(i) <= 'z')
            {
                cell = str.charAt(i) - 'a';
                check[cell] = true;
            }
        }
        for(int i = 0; i <= 25; i++)
        {
            if(!check[i])
            {
                return false;
            }
        }
        return true;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int count = 0;
        for (String i : array){
            if(i == value){
                count++;
            }
        }
        return count;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        String[] newArray = new String[array.length-1];
        int count = 0;
        int j = 0;
        for (String i : array){
            if(i != valueToRemove){
                newArray[count] = array[j];
                count++;
            }
            j++;
        }
        return newArray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        return null;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        return null;
    }


}

