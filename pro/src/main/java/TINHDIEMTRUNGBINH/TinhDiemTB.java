/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TINHDIEMTRUNGBINH;

import java.util.StringTokenizer;

/**
 *
 * @author nguyenquanghuy
 */
public class TinhDiemTB {

    private String maSV, ten;
    private int xepHang;
    private static int id = 0;
    private Float diemTB;

    public TinhDiemTB(String ten, int d1, int d2, int d3) {
        this.diemTB = trungBinh(d1, d2, d3);
        this.ten = chuanHoa(ten);
        this.maSV = taoMaSV();
    }

    public int getXepHang() {
        return xepHang;
    }

    private float trungBinh(int d1, int d2, int d3) {
        return (float) (d1 * 3 + d2 * 3 + d3 * 2) / 8;
    }

    private String taoMaSV() {
        id++;
        StringBuilder result = new StringBuilder(String.valueOf(id));
        if (id < 10) {
            result.insert(0, "0");
        }
        result.insert(0, "SV");
        return result.toString();
    }

    public String getMaSV() {
        return maSV;
    }

    public void setXepHang(int xepHang) {
        this.xepHang = xepHang;
    }

    public float getDiem() {
        return diemTB;
    }

    private String chuanHoa(String ten) {
        StringTokenizer str = new StringTokenizer(ten.trim().toLowerCase(), " ");
        StringBuilder result = new StringBuilder("");
        while (str.hasMoreTokens()) {
            String temp = str.nextToken();
            result.append(temp.substring(0, 1).toUpperCase() + temp.substring(1) + " ");
        }
        return result.toString().trim();
    }

    @Override
    public String toString() {
        return maSV + " " + ten + " " + String.format("%.2f", (double) Math.round(diemTB * 100) / 100) + " " + xepHang;
    }
}
