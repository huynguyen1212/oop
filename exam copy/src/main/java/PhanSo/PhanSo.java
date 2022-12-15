/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PhanSo;

import java.math.BigInteger;

/**
 *
 * @author nguyenquanghuy
 */
public class PhanSo {

    private BigInteger tu, mau;
    
    public PhanSo(BigInteger tu, BigInteger mau) {
        this.tu = tu;
        this.mau = mau;
    }
    
    @Override
    public String toString() {
        BigInteger t = tu.gcd(mau);
        return tu.divide(t) + "/" + mau.divide(t);
    }
    
}
