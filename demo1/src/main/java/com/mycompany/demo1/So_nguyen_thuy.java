/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.demo1;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author nguyenquanghuy
 */
public class So_nguyen_thuy {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t-- > 0) {
            long n = in.nextLong();
            Queue<String> queue = new ArrayDeque<>();
            queue.add("4");
            queue.add("5");
            while (n-- > 0) {
                String s1 = queue.peek();
                String s2 = queue.peek();
                queue.remove();
                queue.add(s1 + "4");
                queue.add(s2 + "5");
                StringBuilder str = new StringBuilder(s2);
                System.out.print(s1 + str.reverse().toString() + " ");
            }
            System.out.print("\n");
        }
    }
}
