/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package XEPLOAI;

import java.util.StringTokenizer;

/**
 *
 * @author nguyenquanghuy
 */
public class XepLoai {

    private String ma, ten, xepLoai;
    private String diemTongKet;
    private static int id = 1;

    public XepLoai(String ten, float d1, float d2, float d3) {
        this.ten = chuanHoaTen(ten);
        this.diemTongKet = tinhDiemTK(d1, d2, d3);
        this.ma = createMaSV();
    }

    public String getDiemTK() {
        return diemTongKet;
    }

    private String createMaSV() {
        StringBuilder str = new StringBuilder(String.valueOf(id));
        if (id < 10) {
            str.insert(0, "0");
        }
        id++;
        str.insert(0, "SV");
        return str.toString();
    }

    private String tinhDiemTK(float d1, float d2, float d3) {
        float sum = (float) d1 * 25 / 100 + (float) d2 * 35 / 100 + (float) d3 * 40 / 100;
        if (sum >= 8) {
            xepLoai = "GIOI";
        }
        if (sum < 8 && sum >= 6.5) {
            xepLoai = "KHA";
        }
        if (sum < 6.5 && sum >= 5) {
            xepLoai = "TRUNG BINH";
        }
        if (sum < 5) {
            xepLoai = "KEM";
        }
        return String.format("%.2f", sum);
    }

    private String chuanHoaTen(String hoTen) {
        StringTokenizer str = new StringTokenizer(hoTen.trim().toLowerCase(), " ");
        StringBuilder result = new StringBuilder();
        while (str.hasMoreTokens()) {
            String temp = str.nextToken();
            result.append(temp.substring(0, 1).toUpperCase() + temp.substring(1) + " ");
        }
        return result.toString();
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + diemTongKet + " " + xepLoai;
    }
}
