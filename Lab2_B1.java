package com.chezis.fptschool;

import java.util.Scanner;

public class Lab2_B1 {

public static void giaiPTB1(float a, float b) {

    if ( a == 0 ) {

        if ( b == 0 ) {
            System.out.println("Phương trình có vô số nghiệm");
        }

        else {
            System.out.println("Phương trình vô nghiệm");
        }

    } else {

        float x = -b /a;
        System.out.println("x = -b / a");
        System.out.println("Giá trị của x là : " +x);

    }
}

public static void ptb1()
{

    Scanner sc = new Scanner(System.in);
    try {
        System.out.print("Nhập hệ số A : ");
        float a = sc.nextInt();
        System.out.print("Nhập hệ số B : ");
        float b = sc.nextInt();
        System.out.println("\n");
        giaiPTB1(a,b);
    }
    catch (Exception e) {
        System.out.println("\nVui lòng chỉ nhập giá trị số");
//            System.out.println("Lỗi: " + e.toString());
    }
}

public static void main(String[] args) {
    ptb1();
}

}
