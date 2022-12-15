/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.demo1;

import java.util.Scanner;
import static java.lang.Math.abs;

/**
 *
 * @author nguyenquanghuy
 */
public class so_lien_ke {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n;
        n = in.nextInt();
        if (n <= 20) {
            for (int i = 0; i < n; i++) {
                long t = in.nextLong();
                if (t >= 10) {
                    boolean check = true;

                    while (t != 0) {
                        long temp = t % 10;
                        t = t / 10;
                        if (abs(t % 10 - temp) != 1 && t != 0) {
                            check = false;
                            break;
                        }
                    }
                    if (check) {
                        System.out.println("YES");
                    } else {
                        System.out.println("NO");
                    }
                }
            }
        }
    }
}
