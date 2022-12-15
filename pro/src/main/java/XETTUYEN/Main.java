/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package XETTUYEN;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.Scanner;

/**
 *
 * @author nguyenquanghuy
 */
public class Main {

    public static void main(String[] args) throws ParseException, FileNotFoundException {
//        /Users/nguyenquanghuy/Desktop/pro/src/main/java/XETTUYEN/XETTUYEN.in
        Scanner in = new Scanner(new File("XETTUYEN.in"));
        int t = Integer.parseInt(in.nextLine());
        while (t-- > 0) {
            XetTuyen nv = new XetTuyen(in.nextLine(), in.nextLine(),
                    Float.parseFloat(in.nextLine()), Float.parseFloat(in.nextLine()));
            System.out.println(nv.toString());
        }
    }
}
