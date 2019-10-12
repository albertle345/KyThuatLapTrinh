package com.company.tablesearch;


import java.util.Scanner;

public class DaysOfWeek {
    public static void main(String args[]){
        Scanner read = new Scanner(System.in);
        System.out.println("nhap so");
        int number = read.nextInt();
        String theDayOfTheWeek = DaysOfWeek(number);
        System.out.println("thats "+theDayOfTheWeek);
    }
    private static String DaysOfWeek(int day){
        String weekDay[] = {"Nope", "Nope", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        String theDay;
        if(day > 0 && day <= 8){
            theDay = weekDay[day];
        }
        else{
            theDay = weekDay[0];
        }
        return theDay;
    }
}
