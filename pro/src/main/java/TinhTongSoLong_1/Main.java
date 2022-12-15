/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TinhTongSoLong_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author nguyenquanghuy
 */
public class Main {

    public static void main(String[] args) throws FileNotFoundException {
//        /Users/nguyenquanghuy/Desktop/pro/src/main/java/TinhTongSoLong_1/DATA.in
        Scanner in = new Scanner(new File("DATA.in"));

        long result = 0;
        int resultInt = 0;
        while (in.hasNext()) {
            String a = in.nextLine();
            String[] s = a.split(" ");
            for (int i = 0; i < s.length; i++) {
                try {
                    long n = Long.parseLong(s[i]);
                    if(n > Math.pow(2, 31)) {
                        result = result + n;
                    }
                } catch (Exception e) {
                    continue;
                }
            }
        }
        System.out.println("" + result);
    }

}
