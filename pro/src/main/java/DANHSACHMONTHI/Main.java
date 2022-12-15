/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DANHSACHMONTHI;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nguyenquanghuy
 */
public class Main {

    public static void main(String[] args) throws FileNotFoundException {
//        /Users/nguyenquanghuy/Desktop/pro/src/main/java/DANHSACHMONTHI/MONHOC.in
        Scanner in = new Scanner(new File("MONHOC.in"));
        int test = Integer.parseInt(in.nextLine());
        
        ArrayList<DanhSachMonThi> arrayList = new ArrayList<>();
        
        while (test-- > 0) {
            DanhSachMonThi ds = new DanhSachMonThi(in.nextLine(), in.nextLine(), in.nextLine());
            arrayList.add(ds);
        }
        arrayList.sort((DanhSachMonThi m1, DanhSachMonThi m2) -> m1.getMaMon().compareTo(m2.getMaMon()));
        arrayList.forEach(item -> System.out.println(item));
    }
}
