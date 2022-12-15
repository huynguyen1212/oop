/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TINHTHUNHAPGIAOVIEN;

/**
 *
 * @author nguyenquanghuy
 */
public class GiaoVien {

    private String ma, ten;
    private long luongCoBan;
    private static final long ht = 2000000, hp = 900000, gv = 500000;

    public GiaoVien(String ma, String ten, long luongCoBan) {
        this.ma = ma;
        this.ten = ten;
        this.luongCoBan = luongCoBan;
    }

    public String kq() {
        String viTri = ma.charAt(0) + "" + ma.charAt(1) + "";
        String thuNhap = ma.charAt(2) + "" + ma.charAt(3) + "";
        
        long troCap = 0;

        if (viTri.equals("HT")) {
            troCap = ht;
        }

        if (viTri.equals("HP")) {
            troCap = hp;
        }

        if (viTri.equals("GV")) {
            troCap = gv;
        }

        long tong = luongCoBan * Integer.parseInt(thuNhap) + troCap;

        return ma + " " + ten + " " + Integer.parseInt(thuNhap) + " " + troCap
                + " " + tong;
    }
}
