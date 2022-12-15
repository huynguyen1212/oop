/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.demo1;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author nguyenquanghuy
 */
public class Danh_so_thu_tu_cap_dau_ngoac {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        while (n-- > 0) {
            String s = sc.nextLine();
            Stack<Integer> stk = new Stack<>();

            int t = 1;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(') {
                    stk.add(t);
                    System.out.print(t + " ");
                    t++;
                } else if (s.charAt(i) == ')') {
                    System.out.print(stk.peek() + " ");
                    stk.pop();
                }
            }
            System.out.println("");
        }
    }
}
