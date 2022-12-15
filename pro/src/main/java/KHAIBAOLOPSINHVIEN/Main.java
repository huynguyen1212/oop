package KHAIBAOLOPSINHVIEN;

import java.text.ParseException;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author nguyenquanghuy
 */
public class Main {

    public static void main(String[] args) throws ParseException{
        Scanner in = new Scanner(System.in);
        SinhVien sv = null;

        try {
            sv = new SinhVien(in.nextLine(), in.nextLine(), in.nextLine(), in.nextFloat());
        } catch (ParseException e) {
            throw new RuntimeException();
        }
        System.out.println(sv.toString());
    }
}
