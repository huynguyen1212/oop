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
public class ucln {

    public static String chia(String a, long b) {
        long temp = 0;
        for (int i = 0; i < a.length(); i++) {
            int x = Integer.valueOf(a, i);
            temp = (temp * 10 + x) % b;
        }
        return String.valueOf(temp);
    }

    public static long ucln(String a, long b) {
        if (a == "0") {
            return b;
        }
        return ucln(chia(a, b), b);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        for (int i = 0; i < n; i++) {
            long a = Long.parseLong(in.nextLine());
            String b = in.nextLine();
            System.out.println(ucln(b, a));
        }
    }
}
