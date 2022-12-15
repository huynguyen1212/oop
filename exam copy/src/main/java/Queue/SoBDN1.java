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
public class SoBDN1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        while (t-- > 0) {
            long n = in.nextLong();
            int dem = 0;
            Queue<String> q = new LinkedList<>();

            q.add("1");
            while (!q.isEmpty() && Long.parseLong(q.peek()) <= n) {
                String temp = q.poll();
                dem++;
                q.add(temp + "0");
                q.add(temp + "1");
            }
            System.out.println(dem);
        }
    }
}
