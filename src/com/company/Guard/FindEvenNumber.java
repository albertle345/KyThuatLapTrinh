package com.company.Guard;

public class FindEvenNumber {
    public static void main(String args[]){
        int array[] = {2, 1, 3, 6, 4, 9, 5};
        int minEven = findMinEven(array);
        System.out.println("so chan nho nhat: "+minEven);
    }
    private  static int evenNumbers(int array[]){
        int firstEven = 0;
        for(int i = 0;i < array.length;i++){
            if(array[i] % 2 == 0){
                firstEven = array[i];
                break;
               // return array[i];
            }
        }
        return firstEven;
    }
    private static int findMinEven(int array[]){
        int minEven = evenNumbers(array);
        for(int i = 0; i < array.length;i++){
            if(array[i] % 2 == 0){
                if(array[i] < minEven){
                    minEven = array[i];
                }
            }
        }
        return minEven;
    }
}
