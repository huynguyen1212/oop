/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TN01022_TinhLuyThua;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author nguyenquanghuy
 */
public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long M = (long) 10e8 + 7;

        while (true) {
            BigInteger a = s.nextBigInteger();
            BigInteger b = s.nextBigInteger();

            if (a.equals(b) && b.equals(BigInteger.ZERO)) {
                break;
            }
            long ans = a.modPow(b, BigInteger.valueOf(M)).longValue();
            System.out.println(ans);

        }
    }
}
