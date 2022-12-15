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
public class tach_doi {

    static Long ucln(Long a, Long b) {
        if (b == 0) {
            return a;
        }
        return ucln(b, a % b);
    }

    static Long bcnn(Long a, Long b) {
        return (a * b) / ucln(a, b);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        
        for (int i = 0; i < t; i++) {
            String n = in.nextLine();
            int le = n.length();

            if (le % 2 > 0 || le > 18) {
                System.out.println("INVALID");
            } else {
                String a = n.substring(0, le / 2);
                String b = n.substring(le / 2, le);
                Long ans = bcnn(Long.parseLong(a), Long.parseLong(b));
                System.out.println(ans);
            }
        }
    }
}
