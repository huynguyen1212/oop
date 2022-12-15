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
public class SoDep {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        in.nextLine();

        while (t-- > 0) {
            String s = in.nextLine();
            if (tn(s) && chan(s)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static boolean tn(String s) {
        StringBuilder s1 = new StringBuilder(s);
        String s2 = s1.reverse().toString();
        return s.equals(s2);
    }

    public static boolean chan(String s) {
        for (int i = 0; i < s.length(); i++) {
            int t = s.charAt(i) - '0';
            if (t % 2 == 1) {
                return false;
            }
        }
        return true;
    }
}
