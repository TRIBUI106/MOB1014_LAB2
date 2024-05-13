package com.chezis.fptschool;

import java.util.Scanner;
import java.lang.Math;

public class Lab2_B2 {

    public static void giaiPTB2(float a, float b, float c) {
        if ( a == 0 ) {

            System.out.printf("Phương trình bậc nhất x = -b/a : %.1f",-b/a);

        } if ( a != 0 ) {
            double delta = Math.pow(b,2) - (4 * a * c);

            if ( delta <= 0 ) {
                System.out.println("Phương trình vô nghiệm");
            }

            if ( delta == 0 ) {
                System.out.println("Có X là nghiệm kép");
//                float temp = -b/(2*a);
                System.out.println("X = " +(-b/(2*a)));
            }

            if ( delta >= 0 ) {
                System.out.println("Phương trình có 2 nghiệm phân biệt");
                double x1 = (-b - Math.sqrt(delta)) / ( 2 * a );
                double x2 = (b - Math.sqrt(delta)) / ( 2 * a );
                System.out.printf("X1 = %.2f", x1);
                System.out.printf("\n");
                System.out.printf("X2 = %.2f", x2);
            }


        }

    }
    public static void ptb2() {
        Scanner scan = new Scanner(System.in);

        try {
            System.out.print("Nhập hệ số A : ");
            float a = scan.nextInt();
            System.out.print("Nhập hệ số B : ");
            float b = scan.nextInt();
            System.out.print("Nhập hệ số C : ");
            float c = scan.nextInt();
            System.out.println("\n");
            giaiPTB2(a,b,c);
        } catch (Exception e) {
            System.out.println("\nVui lòng chỉ nhập giá trị số");
//            System.out.println("Lỗi: " + e.toString());
        }
    }
    public static void main(String[] args) {
        ptb2();
    }

}
