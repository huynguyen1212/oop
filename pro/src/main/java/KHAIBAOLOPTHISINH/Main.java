/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KHAIBAOLOPTHISINH;

import java.text.ParseException;
import java.util.Scanner;

/**
 *
 * @author nguyenquanghuy
 */
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ThiSinh thiSinh = null;

        try {
            thiSinh = new ThiSinh(in.nextLine(), in.nextLine(), in.nextFloat(), in.nextFloat(), in.nextFloat());
        } catch (ParseException e) {
            throw new RuntimeException();
        }
        System.out.println(thiSinh.toString());
    }
}
