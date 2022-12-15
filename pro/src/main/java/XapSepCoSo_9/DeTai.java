/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package XapSepCoSo_9;

/**
 *
 * @author nguyenquanghuy
 */
public class DeTai {

    private static int count = 1;
    private String ten, gv, ma;

    public DeTai(String gv, String ten) {
        this.ten = ten;
        this.gv = gv;
        this.ma = "DT" + String.format("%03d", count);
        count++;
    }

    public DeTai() {
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        DeTai.count = count;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGv() {
        return gv;
    }

    public void setGv(String gv) {
        this.gv = gv;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

}
