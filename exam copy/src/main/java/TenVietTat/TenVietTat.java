/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TenVietTat;

import java.util.StringTokenizer;

/**
 *
 * @author nguyenquanghuy
 */
public class TenVietTat {

    private String hoTen;

    public String getTen() {
        StringTokenizer str = new StringTokenizer(hoTen, " ");
        String result = "";
        while (str.hasMoreTokens()) {
            result = str.nextToken();
        }
        return result;
    }

    public String getHo() {
        StringTokenizer str = new StringTokenizer(hoTen, " ");
        String result = str.nextToken();
        return result;
    }

    public TenVietTat(String hoTen) {
        this.hoTen = hoTen;
    }

    public boolean check(String a) {
        StringTokenizer str = new StringTokenizer(a, ".");
        StringTokenizer str1 = new StringTokenizer(hoTen, " ");
        boolean check = false;

        if (str.countTokens() - str1.countTokens() != 0) {
            return false;
        } else {
            while (str.hasMoreTokens()) {
                String temp = str.nextToken();
                String temp1 = str1.nextToken();
                if (!temp.equals("*") && !temp1.substring(0, 1).equals(temp)) {
                    check = true;
                }
            }
        }
        return !check;
    }

    @Override
    public String toString() {
        return hoTen;
    }
}
