/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.demo1;

import java.util.Scanner;

/**
 *
 * @author nguyenquanghuy
 */
public class _74_so_fibonacci {

    public static int fibonacci(int t) {
        int cnt = 2;
        int a0 = 1, a1 = 1, a2 = 2;
        if (t == 1 || t == 2) {
            return 1;
        } else {
            while (cnt++ < t) {
                a2 = a0 + a1;
                a0 = a1;
                a1 = a2;
            }
            return a2;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            int t = in.nextInt();

            if (t <= 92) {
                System.out.println(fibonacci(t));
            }
        }
    }
}
