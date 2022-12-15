/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DANHSACHMATHANG;

/**
 *
 * @author nguyenquanghuy
 */
public class MatHang {

    private String maMathang, tenMatHang, thongTin;
    private static int idTemp = 1;
    private long giaMua, giaBan;

    public MatHang(String tenMatHang, String thongTin, long giaMua, long giaBan) {
        this.tenMatHang = tenMatHang;
        this.thongTin = thongTin;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
        this.maMathang = createID();
    }

    private String createID() {
        int id = idTemp++;
        StringBuilder temp = new StringBuilder(String.valueOf(id));
        for (int i = temp.length(); i < 3; i++) {
            temp.insert(0, "0");
        }
        temp.insert(0, "MH");
        return temp.toString();
    }

    public long lai() {
        return giaBan - giaMua;
    }

    @Override
    public String toString() {
        return maMathang + " " + tenMatHang + " " + thongTin
                + " " + giaMua + " " + giaBan + " " + lai();
    }

}
