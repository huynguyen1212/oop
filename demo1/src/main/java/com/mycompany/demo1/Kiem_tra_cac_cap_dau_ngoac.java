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
public class Kiem_tra_cac_cap_dau_ngoac {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s = sc.nextLine();
            if (check(s)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static boolean check(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                st.push(s.charAt(i));
            } else {
                if (!st.isEmpty()) {
                    if (s.charAt(i) == ')' && st.peek() == '(') {
                        st.pop();
                    } else if (s.charAt(i) == ']' && st.peek() == '[') {
                        st.pop();
                    } else if (s.charAt(i) == '}' && st.peek() == '{') {
                        st.pop();
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}
