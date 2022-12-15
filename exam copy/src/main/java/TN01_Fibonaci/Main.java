/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TN01_Fibonaci;

import java.util.Scanner;

/**
 *
 * @author nguyenquanghuy
 */
public class Main {

    public static void main(String[] args) {
        long f[] = new long[100];
        f[0] = 0;
        f[1] = 1;

        for (int i = 2; i <= 92; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t-- > 0) {
            int n = in.nextInt();
            System.out.println(f[n]);
        }
    }
}
