package com.mycompany.demo1;

import java.util.Scanner;
import java.util.TreeSet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author nguyenquanghuy
 */
public class _24_giao_cua_hai_day_so {

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

        TreeSet<Integer> c = (TreeSet<Integer>) a.clone();
        c.retainAll(b);
        for (Integer x : c) {
            System.out.print(x + " ");
        }
    }
}
