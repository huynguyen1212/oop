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
public class ucln_bcnn {

    public static long bcnn(long a, long b) {
        return (a * b) / ucln(a, b);
    }

    public static long ucln(long a, long b) {
        if (b == 0) {
            return a;
        }
        return ucln(b, a % b);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            long a = in.nextLong();
            long b = in.nextLong();
            System.out.print(bcnn(a, b) + " ");
            System.out.println(ucln(a, b));
        }
    }
}
