/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.demo1;

import static java.lang.Math.abs;
import java.util.Scanner;

/**
 *
 * @author nguyenquanghuy
 */
public class so_khong_lien_ke {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        for (int i = 0; i < n; i++) {
            long s = in.nextLong();
            long t = 0;
            boolean check = true;
            
            while (s != 0) {
                long temp = s % 10;
                t = t + temp;
                s = s / 10;
                if (abs(s % 10 - temp) != 2 && s != 0) {
                    check = false;
                }
            }
            if (check && t % 10 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
