/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PhanSo;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author nguyenquanghuy
 */
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PhanSo ps = new PhanSo(in.nextBigInteger(), in.nextBigInteger());
        System.out.println(ps);
    }
}
