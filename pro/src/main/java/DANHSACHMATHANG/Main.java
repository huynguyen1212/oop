/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DANHSACHMATHANG;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author nguyenquanghuy
 */
public class Main {

    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();

        ArrayList<MatHang> arrayList = new ArrayList<MatHang>();

        for (int i = 0; i < t; i++) {
            MatHang temp = new MatHang(in.nextLine(), in.nextLine(), Long.parseLong(in.nextLine()), Long.parseLong(in.nextLine()));
            arrayList.add(temp);
        }
        
        Collections.sort(arrayList, new Comparator<MatHang>() {
            @Override
            public int compare(MatHang o1, MatHang o2) {
                return (int) (o2.lai() - o1.lai());
            }
        });
        arrayList.forEach(item -> System.out.println(item.toString()));
    }
}
