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
public class So_luong_dau_ngoac_vuong_lon_nhat {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int temp = 0;
        Stack<Character> stk = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '[' || s.charAt(i) == '(') {
                stk.push(s.charAt(i));
            } else {
                if (!stk.isEmpty()) {
                    if (s.charAt(i) == ')' && stk.peek() == '(' || s.charAt(i) == '(' && stk.peek() == '(') {
                        stk.pop();
                    } else if (s.charAt(i) == '(' && stk.peek() == ']') {
                        temp = 0;
                        break;
                    } else if (s.charAt(i) == ']' && stk.peek() == '[') {
                        temp++;
                        stk.pop();
                    }
                }
            }
        }
        System.out.print(temp);
    }
}
