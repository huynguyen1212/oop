/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.demo1;

import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author nguyenquanghuy
 */
public class _25_hop_cua_hai_day_so {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        
        TreeSet<Integer> a = new TreeSet<>();
        TreeSet<Integer> b = new TreeSet<>();
        
        for (int i = 0; i < n; i++) {
            a.add(in.nextInt());
        }
        for (int i = 0; i < m; i++) {
            b.add(in.nextInt());
        }
        b.removeAll(a);
        a.addAll(b);
        
        for (Integer x : a) {
            System.out.print(x + " ");
        }
    }
}
