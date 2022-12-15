/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DanhSachMatHang;

/**
 *
 * @author nguyenquanghuy
 */
public class MatHang {

    private String maMatHang, tenMatHang, donVi;
    private long giaMua, giaBan;
    private static int idTemp = 1;

    public MatHang(String tenMatHang, String donVi, long giaMua, long giaBan) {
        this.maMatHang = createId();
        this.tenMatHang = tenMatHang;
        this.donVi = donVi;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }

    private String createId() {
        int id = idTemp++;
        StringBuilder temp = new StringBuilder(String.valueOf(id));
        for (int i = temp.length(); i < 3; i++) {
            temp.insert(0, 0);
        }
        temp.insert(0, "MH");
        return temp.toString();
    }

    public long lai() {
        return giaBan - giaMua;
    }

    @Override
    public String toString() {
        return maMatHang + " " + tenMatHang + " " + donVi + " " + giaMua + " " + giaBan + ' ' + lai();
    }

}
