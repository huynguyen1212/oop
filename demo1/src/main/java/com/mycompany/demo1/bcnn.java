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
public class bcnn {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int n1, n2, lcm;
            n1 = sc.nextInt();
            n2 = sc.nextInt();

            lcm = (n1 > n2) ? n1 : n2;

            while (true) {
                if (lcm % n1 == 0 && lcm % n2 == 0) {
                    System.out.printf("Bội chung nhỏ nhất của %d và %d là %d.", n1, n2, lcm);
                    break;
                }
                ++lcm;
            }
        }
    }
}
