/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DanhSachSinhVien;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author nguyenquanghuy
 */
public class SinhVien {

    private String maSV, hoTen, lop;
    private Date ngaySinh;
    private float gpa;

    private static Integer id = 1;

    public SinhVien(String hoTen, String lop, String ngaySinh, float gpa) throws ParseException {
        this.maSV = createId();
        this.hoTen = hoTen;
        this.lop = lop;
        this.ngaySinh = new SimpleDateFormat("dd/mm/yyyy").parse(ngaySinh);
        this.gpa = gpa;
    }

    private String createId() {
        StringBuilder str = new StringBuilder(id.toString());
        id++;
        for (int i = str.length(); i < 3; i++) {
            str.insert(0, "0");
        }
        str.insert(0, "B20DCCN");
        return str.toString();
    }

    @Override
    public String toString() {
        return maSV + " " + hoTen + " " + lop + " "
                + new SimpleDateFormat("dd/mm/yyyy").format(ngaySinh)
                + " " + String.format("%.2f", gpa);
    }

}
