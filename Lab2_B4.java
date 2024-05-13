package com.chezis.fptschool;

import java.util.Scanner;
import java.lang.*;

public class Lab2_B4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input;
        do {
            System.out.println("*============== MENU ==============*");
            System.out.println("1. Giải phương trình bậc nhất");
            System.out.println("2. Giải phương trình bậc hai");
            System.out.println("3. Tính tiền điện");
            System.out.println("4. Thoát");
            System.out.println("*============== MENU ==============*");
            System.out.print("Nhập chức năng muốn chọn : ");
            input = sc.nextInt();
            switch (input) {
                case 1:
                    System.out.println("Chức năng 1");
                    Lab2_B1.ptb1();
                    break;
                case 2:
                    System.out.println("Chức năng 2");
                    Lab2_B2.ptb2();
                    break;
                case 3:
                    System.out.println("Chức năng 3");
                    Lab2_B3.tinhTienDien();
                    break;
                case 4:
                    System.out.println("Chức năng 4 : Thoát ");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Vui lòng nhập giá trị t 1 -> 4");

            }
        } while (input != 0);
        }
    }
