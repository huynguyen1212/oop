/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DanhSachSinhVien;

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
        ///Users/nguyenquanghuy/Desktop/exam/src/main/java/DanhSachSinhVien/SV.in
        Scanner in = new Scanner(new File("SV.in"));
        in.nextLine();
        while (in.hasNext()) {
            SinhVien sv = new SinhVien(in.nextLine(), in.nextLine(), in.nextLine(), Float.parseFloat(in.nextLine()));
            System.out.println(sv);
        }
    }
}
