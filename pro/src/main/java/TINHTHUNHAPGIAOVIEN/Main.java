/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TINHTHUNHAPGIAOVIEN;

import java.util.Scanner;

/**
 *
 * @author nguyenquanghuy
 */
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        GiaoVien gv = new GiaoVien(in.nextLine(), in.nextLine(), in.nextLong());
        System.out.println(gv.kq());
    }
}
