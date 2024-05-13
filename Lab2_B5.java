package com.chezis.fptschool;

import java.util.Scanner;

public class Lab2_B5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Nhập giá trị A : ");
            int a = sc.nextInt();
            System.out.print("Nhập giá trị B : ");
            int b = sc.nextInt();
            System.out.print("Nhập giá trị C : ");
            int c = sc.nextInt();
            findMax(a,b,c);
        } catch (Exception e) {
            System.out.println("\nVui lòng chỉ nhập giá trị số");
    //            System.out.println("Lỗi: " + e.toString());
        }
    }

    public static void findMax(int a, int b, int c) {
        int max;
        if ( a > b ) {
            max = a;
        } else {
            max = b;
        }
        if ( c > max ) {
            max = c;
        }

        System.out.print("Giá trị lớn nhất là : " + max);
    }


}
