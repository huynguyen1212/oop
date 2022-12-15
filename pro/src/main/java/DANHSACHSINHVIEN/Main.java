/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DANHSACHSINHVIEN;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.Scanner;

/**
 *
 * @author nguyenquanghuy
 */
public class Main {

    public static void main(String[] args) throws FileNotFoundException, ParseException {
//        /Users/nguyenquanghuy/Desktop/pro/src/main/java/DANHSACHSINHVIEN/SV.in
        Scanner in = new Scanner(new File("SV.in"));
        int t = in.nextInt();
        in.nextLine();
        while (in.hasNextLine()) {
            DanhSachSinhVien sv = new DanhSachSinhVien(in.nextLine(), in.nextLine(),
                     in.nextLine(), Float.parseFloat(in.nextLine()));
            System.out.println(sv);
        }
    }
}
