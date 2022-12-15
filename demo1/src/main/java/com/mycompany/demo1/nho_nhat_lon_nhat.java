/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.demo1;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author nguyenquanghuy
 */
public class nho_nhat_lon_nhat {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            int n;
            n = in.nextInt();
            BigInteger[] arr = new BigInteger[n];
            BigInteger min = null;
            BigInteger max = null;

            if (n <= 20 && n > 0) {
                for (int i = 0; i < n; i++) {
                    arr[i] = in.nextBigInteger();
                }

                max = arr[0];
                min = arr[0];

                for (int i = 1; i < n; i++) {
                    max = max.max(arr[i]);
                    min = min.min(arr[i]);
                }

                if (min == max) {
                    System.out.println("BANG NHAU");
                } else {
                    System.out.println(min + " " + max);

                }
            } else if (n == 0) {
                return;
            }
        }
    }
}
