/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package XEPLOAI;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nguyenquanghuy
 */
public class Main {

    public static void main(String[] args) throws FileNotFoundException {
//        /Users/nguyenquanghuy/Desktop/pro/src/main/java/XEPLOAI/BANGDIEM.in
        Scanner in = new Scanner(new File("BANGDIEM.in"));
        int t = Integer.parseInt(in.nextLine());

        ArrayList<XepLoai> arrayList = new ArrayList<>();
        while (t-- > 0) {
            XepLoai sv = new XepLoai(in.nextLine(), Integer.parseInt(in.nextLine()),
                    Integer.parseInt(in.nextLine()), Integer.parseInt(in.nextLine()));
            arrayList.add(sv);
        }

        arrayList.sort((XepLoai o1, XepLoai o2) -> o2.getDiemTK().compareTo(o1.getDiemTK()));

        arrayList.forEach(item -> System.out.println(item));
    }
}
