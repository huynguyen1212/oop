/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TINHDIEMTRUNGBINH;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author nguyenquanghuy
 */
public class Main {

    public static void main(String[] args) throws FileNotFoundException {
//        /Users/nguyenquanghuy/Desktop/pro/src/main/java/TINHDIEMTRUNGBINH/BANGDIEM.in
        Scanner in = new Scanner(new File("BANGDIEM.in"));
        int t = Integer.parseInt(in.nextLine());
        
        ArrayList<TinhDiemTB> arrayList = new ArrayList<>();
        while (t-- > 0) {
            TinhDiemTB temp = new TinhDiemTB(in.nextLine(), Integer.parseInt(in.nextLine()),
                    Integer.parseInt(in.nextLine()), Integer.parseInt(in.nextLine()));
            arrayList.add(temp);
        }

        arrayList.sort((TinhDiemTB o1, TinhDiemTB o2) -> {
            if (Float.compare(o2.getDiem(), o1.getDiem()) == 0) {
                return o1.getMaSV().compareTo(o2.getMaSV());
            }
            return Float.compare(o2.getDiem(), o1.getDiem());
        });

        int xepHang = 1;

        for (int i = 0; i < arrayList.size(); i++) {
            if (i >= 1 && Float.compare(arrayList.get(i - 1).getDiem(), arrayList.get(i).getDiem()) == 0) {
                arrayList.get(i).setXepHang(arrayList.get(i - 1).getXepHang());
            } else {
                xepHang = i + 1;
                arrayList.get(i).setXepHang(xepHang);
            }
        }

        arrayList.forEach(item -> System.out.println(item.toString()));
    }
}
