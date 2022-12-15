/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KHAIBAOLOPNHANVIEN;

import java.text.ParseException;
import java.util.Scanner;

/**
 *
 * @author nguyenquanghuy
 */
public class Main {

    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);
        NhanVien nv = new NhanVien(in.nextLine(), in.nextLine(), in.nextLine(),
                in.nextLine(), in.nextLine(), in.nextLine());
        System.out.println(nv.toString());
    }
}
