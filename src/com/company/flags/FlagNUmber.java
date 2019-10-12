package com.company.flags;

import java.util.Scanner;

public class FlagNUmber {
    public static void main(String args[]){
        Scanner read = new Scanner(System.in);
        int numberArray[] = {-3, 1, 5, 9 , 0};
        int numberArray1[] = {1, 2, 3, 4, 5};
        int numberArray2[] = {3,5,7,9,11,13};
        int x = read.nextInt();
        if(GreatestMin(x,numberArray)){
            System.out.println(x + " lon hon so nho nhat");
        }
        if(GreatestMax(x, numberArray)){
            System.out.println(x + "lon hon so lon nhat");
        }
        int pos = findValue(x, numberArray);
        if(findValue(x, numberArray) < 0){
            System.out.println(x + "ko nam trog mang");
        }
        else{
            System.out.println(x + "la gia tri thu" + pos);
        }
        if(compare(numberArray1)){
            System.out.println("mang dc sap xep tang dan");
        }
        if(oddNumber(numberArray2)){
            System.out.println("mang nay toan le");
        }
    }
    private static boolean GreatestMin(int x, int numberArray[]){
        boolean flag = false;
        for(int i = 0; i < numberArray.length;i++){
            if(x > numberArray[i]){
                flag = true;
            }
        }
        return flag;
    }
    private static boolean GreatestMax(int x,int numberArray[]){
        boolean flag = true;
        for(int i = 0;i < numberArray.length;i++){
            if(x < numberArray[i]){
                flag = false;
            }
        }
        return flag;
    }
    private static int findValue(int x, int numberArray[]){
        int position = -1;
        for(int i = 0;i < numberArray.length;i++){
            if(x == numberArray[i]){
                position = i;
                break;
            }
        }
        return position;
    }
    private static boolean compare(int numberArray[]){
        boolean flag = true;
        for(int i = 0;i < numberArray.length - 1;i++){
            if(numberArray[i] > numberArray[i+1]){
                flag = false;
            }
        }
        return flag;
    }
    private static boolean oddNumber(int numberArray[]){
        boolean flag = true;
        for(int i = 0;i < numberArray.length;i++){
            if(numberArray[i] % 2 == 0){
                flag = false;
                break;
            }
        }
        return flag;
    }

}
