package com.company.tablesearch;

import java.util.Scanner;

public class Date {

    public static void main(String[] args) {
	// write your code here
        Scanner read = new Scanner(System.in);
        System.out.println("nhap nam: ");
        int nam = read.nextInt();
        System.out.println("nhap thang: ");
        int thang = read.nextInt();

        int soNgay = tinhSoNgayTrongThang(thang, nam);
        System.out.println("So ngay trong thang la: "+soNgay);

    }

    private static int tinhSoNgayTrongThang(int thang, int nam) {
        int numberOfMonths[] = {-1, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int nDay;
        boolean check = kiemTraNamNhuan(nam);
        if(thang > 0){
            if(thang == 2){
                if(check){
                    numberOfMonths[2] = 29;
                }
            }
        }else {
            thang = 0;
        }
        nDay = numberOfMonths[thang];
        return nDay;
    }
    private static boolean kiemTraNamNhuan(int nam) {
        if(nam % 100 == 0 && nam % 400 == 0)
        {
            return true;
        }
        else
        {
            if(nam % 4 == 0)
            {
                return true;
            }
        }
        return false;

    }
}
