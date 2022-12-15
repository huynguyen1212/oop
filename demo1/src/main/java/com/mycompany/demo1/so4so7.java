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
public class so4so7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long s = in.nextLong();
        int d = 0;

        while (s != 0) {
            long temp = s % 10;
            if (temp == 4 || temp == 7) {
                d++;
            }
            s = s/10;
        }

        if ((d == 4) || (d == 7)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

}
