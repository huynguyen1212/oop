/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.demo1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author nguyenquanghuy
 */
public class tang_dan_giam_dan {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n;
            n = in.nextInt();
            TreeSet<Integer> arrchan = new TreeSet<Integer>();
            TreeSet<Integer> arrle = (TreeSet<Integer>) new TreeSet<Integer>().descendingSet();

            for (int i = 0; i < n; i++) {
                int number = in.nextInt();
                if (number % 2 == 0) {
                    arrchan.add(number);
                } else {
                    arrle.add(number);
                }
            }

            for (int i : arrchan) {
                System.out.print(i + " ");
            }
            System.out.println("");
            for (int i : arrle) {
                System.out.print(i + " ");
            }
            System.out.println("");
        }
    }
}
