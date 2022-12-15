/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pro.DANHSACHCATHI;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author nguyenquanghuy
 */
public class Main {

    public static void main(String[] args) throws FileNotFoundException, ParseException {
//        String path = "/Users/nguyenquanghuy/Desktop/pro/src/main/java/com/mycompany/pro/newpackage/CATHI.in";
        Scanner in = new Scanner(new File("CATHI.in"));
        int test = Integer.parseInt(in.nextLine());
        ArrayList<DanhSachCaThi> list = new ArrayList<DanhSachCaThi>();
        while (test-- > 0) {
            DanhSachCaThi temp = new DanhSachCaThi(in.nextLine(), in.nextLine(), in.nextLine());
            list.add(temp);
        }
        list.sort(new Comparator<DanhSachCaThi>() {
            @Override
            public int compare(DanhSachCaThi o1, DanhSachCaThi o2) {
                if (o1.getNgayThi().compareTo(o2.getNgayThi()) == 0) {
                    if (o1.getGioThi().compareTo(o2.getGioThi()) == 0) {
                        return o1.getMaCaThi().compareTo(o2.getMaCaThi());
                    }
                    return o1.getGioThi().compareTo(o2.getGioThi());
                }
                return o1.getNgayThi().compareTo(o2.getNgayThi());
            }
        });
        list.forEach(item -> System.out.println(item));
    }
}
