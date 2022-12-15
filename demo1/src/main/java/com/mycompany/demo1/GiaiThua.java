/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.demo1;

import java.util.Scanner;

public class GiaiThua {
    public static long tinhGiaithua(int n) {
        long giai_thua = 1;
        if (n == 0 || n == 1) {
            return giai_thua;
        } else {
            for (int i = 2; i <= n; i++) {
                giai_thua *= i;
            }
            return giai_thua;
        }
    } 
    public static void main(String[] args) {
        
      Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long tong = 0;
        for (int i = 1; i <= n; i++) {
            tong += tinhGiaithua(i);
        }
        System.out.println(tong);
      
        
      
    }
}
