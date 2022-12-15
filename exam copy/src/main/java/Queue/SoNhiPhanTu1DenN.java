/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author nguyenquanghuy
 */
public class SoNhiPhanTu1DenN {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t-- > 0) {
            Long n = in.nextLong();
            Queue<String> q = new LinkedList<>();
            q.add("1");
            while (n-- > 0) {
                String temp = q.poll();
                System.out.print(temp + " ");
                q.add(temp + "0");
                q.add(temp + "1");
            }
            System.out.println("");
        }
    }
}
