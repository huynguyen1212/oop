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
public class xau_nhi_phan_doi_xung {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder(in.nextLine());
        int n = stringBuilder.length();
        int t = in.nextInt();
        in.nextLine();

        if (n > 5000) {
            System.out.println("NO");
        }

        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();

            if (a >= 1 && n >= b && a <= b) {
                String str1 = stringBuilder.substring(a - 1, b);
                StringBuilder str2 = new StringBuilder(str1).reverse();

                if (str2.toString().equals(str1)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}
