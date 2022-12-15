/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TINHTONG;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author nguyenquanghuy
 */
public class Main {

    public static void main(String[] args) throws FileNotFoundException {
//        /Users/nguyenquanghuy/Desktop/pro/src/main/java/TINHTONG/DATA.in
        Scanner in = new Scanner(new File("DATA.in"));
        long kq = 0;
        while (in.hasNext()) {
            String s = in.next();
            try {
                int n = Integer.parseInt(s);
                kq += n;
            } catch (NumberFormatException e) {
            }
        }
        System.out.println(kq);
    }
}
