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
public class mang_doi_xung {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            int t = in.nextInt();
            int[] arr = new int[t];
            
            for (int j = 0; j < t; j++) {
                arr[j] = in.nextInt();
            }
            
            boolean check = true;
            for (int j = 0; j < t / 2; j++) {
                if (arr[j] != arr[t - j - 1]) {
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
