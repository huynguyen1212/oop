/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TN;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author nguyenquanghuy
 */
public class ChuanHoaXauHoTen {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();

        while (t-- > 0) {
            String str = in.nextLine();
            StringTokenizer strT = new StringTokenizer(str.trim().toLowerCase() + " ");
            String result = "";
            while (strT.hasMoreTokens()) {
                String temp = strT.nextToken();
                result = result.concat(temp.substring(0, 1).toUpperCase() + temp.substring(1) + " ");
            }
            System.out.println(result);
        }
    }
}
