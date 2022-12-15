/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KHAIBAOLOPTHISINH;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author nguyenquanghuy
 */
public class ThiSinh {

    private String hoTen;
    private Date ngaySinh;
    private float d1, d2, d3;

    public ThiSinh(String hoTen, String ngaySinh, float d1, float d2, float d3) throws ParseException {
        this.hoTen = hoTen;
        this.ngaySinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaySinh);
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }

    @Override
    public String toString() {
        return hoTen + " " + new SimpleDateFormat("dd/MM/yyyy").format(ngaySinh) + " " + String.format("%.1f", d1 + d2 + d3);
    }
}
