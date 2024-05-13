package com.chezis.fptschool;

import java.util.Scanner;

public class Lab2_B3 {
    public static void tinh(int soDien) {
        int tienDien;
        if ( soDien <= 50) {
            tienDien = soDien * 1000;
            System.out.println("Tiền điện là : "+tienDien);
        }

        if ( soDien > 50) {
            tienDien = 50*1000 + ( soDien - 50 ) * 1200 ;
            System.out.println("Tiền điện là : "+tienDien);
        }

    }

    public static void tinhTienDien() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số điện đã tiêu thụ : ");
        try {
            int soDien = sc.nextInt();
            tinh(soDien);
        }
        catch (Exception e) {
            System.out.println("Giá trị bạn vừa nhập không phải là 1 số");
        }

    }

    public static void main(String[] args) {
        tinhTienDien();
    }
}
