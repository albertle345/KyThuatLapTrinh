package com.company.Guard;


public class FindMinPositive {
    public static void main(String args[]){
        int array[] = {-1,3,-3,-2,5,7};
        int min = findMinPositive(array);
        System.out.println("min cua mang la: "+min);
    }
    private static int findFirstPositive(int array[]){
        for(int i = 0;i < array.length;i++){
            if(array[i] > 0){
//                number = array[i];
//                break;
                return  array[i];
            }
        }
        return -1;
    }
    private static int findMinPositive(int array[]){
        int min = findFirstPositive(array);
        if(min != -1){
            for(int i = 0; i < array.length;i++){
                if(array[i] > 0){
                    if(array[i] < min){
                        array[i] = min;
                    }
                }
            }
        }
        return min;
    }
}
