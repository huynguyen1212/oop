/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KHAIBAOLOPNHANVIEN;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author nguyenquanghuy
 */
public class NhanVien {

    private String name, gender, address, taxcode;
    private Date dateOfBirth, signDate;

    public NhanVien(String name, String gender, String dateOfBirth, String address, String taxcode, String signDate) throws ParseException {
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = new SimpleDateFormat("dd/MM/yyyy").parse(dateOfBirth);
        this.address = address;
        this.taxcode = taxcode;
        this.signDate = new SimpleDateFormat("dd/MM/yyyy").parse(signDate);
    }

    @Override
    public String toString() {
        return "00001 " + name + " " + gender + " " + new SimpleDateFormat("dd/MM/yyyy").format(dateOfBirth)
                + " " + address + " " + taxcode + " " + new SimpleDateFormat("dd/MM/yyyy").format(signDate);
    }
}
