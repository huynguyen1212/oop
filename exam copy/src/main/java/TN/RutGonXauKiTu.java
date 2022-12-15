/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TN;

import java.util.Scanner;

/**
 *
 * @author nguyenquanghuy
 */
public class RutGonXauKiTu {

    final static String re = "(\\w)\\1";

    static String a(String b) {
        String c = b.replaceAll(re, "");
        if (c.length() != b.length()) {
            return a(c);
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String k = a(s.nextLine());
        if (k.length() > 0) {
            System.out.println(k);
        } else {
            System.out.println("Empty String");
        }
    }
}
