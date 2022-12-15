/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.demo1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

/**
 *
 * @author nguyenquanghuy
 */
public class tap_tu_rieng_hai_xau {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        in.nextLine();
        for (int i = 0; i < t; i++) {
            StringTokenizer s1 = new StringTokenizer(in.nextLine(), " ");
            StringTokenizer s2 = new StringTokenizer(in.nextLine(), " ");

            Set<String> ss1 = new HashSet<String>();
            Set<String> ss2 = new HashSet<String>();

            while (s1.hasMoreTokens()) {
                ss1.add(s1.nextToken());
            }
            while (s2.hasMoreTokens()) {
                ss2.add(s2.nextToken());
            }

            ss2.retainAll(ss1);

            for (String item : ss1) {
                if (!ss2.contains(item)) {
                    System.out.print(item + " ");
                }
            }

            System.out.println("");
        }
    }
}
