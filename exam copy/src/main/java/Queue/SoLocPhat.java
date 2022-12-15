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
public class SoLocPhat {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        while (t-- > 0) {
            int n = in.nextInt();
            int dem = 0;
            StringBuilder ans = new StringBuilder("");

            Queue<String> q = new LinkedList<>();
            q.add("");

            while (!q.isEmpty()) {
                String temp = q.poll();
                if (temp.length() <= n && !temp.equals("")) {
                    dem++;
                    ans.insert(0, temp + " ");
                }
                if (temp.length() < n) {
                    q.add(temp + "6");
                    q.add(temp + "8");
                }
            }
            System.out.println(dem);
            System.out.println(ans);
        }
    }
}
