/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TN01007_ChiaHet;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author nguyenquanghuy
 */
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t-- > 0) {
            BigInteger a = in.nextBigInteger();
            BigInteger b = in.nextBigInteger();
            BigInteger zero = new BigInteger("0");

            if (a.mod(b).equals(zero) || b.mod(a).equals(zero)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
