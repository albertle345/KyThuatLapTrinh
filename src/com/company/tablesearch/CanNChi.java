package com.company.tablesearch;

import java.util.Scanner;

public class CanNChi {
    public static void main(String args[]){
        Scanner read = new Scanner(System.in);
        System.out.println("xin moi nhap nam duong lich:");
        int namDuong = read.nextInt();
        String namAm = tinhNamAm(namDuong);
        System.out.println(namAm);
    }
    private static String tinhNamAm(int namDuong){
        String tinhCan[] = {"Canh", "Tan", "Nham", "Quy", "Giap", "At", "Binh", "Dinh", "Mau", "Ky"};
        String tinhChi[] = {" Than", " Dau", " Tuat", " Hoi", " Ty", " Suu", " Dan", " Meo", " Thin", " Ty", " Ngo", " Mui"};
        int canDu = namDuong % 10;
        int chiDu = namDuong % 12;
        String can;
        String chi;
        if(canDu >= 0 && canDu <= 9){
            can = tinhCan[canDu];
        }
        else{
            can = "Nope";
        }
        if(chiDu >= 0 && chiDu <= 11){
            chi = tinhChi[chiDu];
        }
        else{
            chi = "Nope";
        }
        return can + chi;
    }
}
