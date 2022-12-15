/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TenVietTat;

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
//        Scanner in = new Scanner(new File("/Users/nguyenquanghuy/Desktop/exam/src/main/java/TenVietTat/DANHSACH.in"));
        Scanner in = new Scanner(new File("DANHSACH.in"));

        int t = Integer.parseInt(in.nextLine());
        ArrayList<TenVietTat> arr = new ArrayList<>();
        while (t-- > 0) {
            TenVietTat hoTen = new TenVietTat(in.nextLine());
            arr.add(hoTen);
        }

        arr.sort(new Comparator<TenVietTat>() {
            @Override
            public int compare(TenVietTat ten1, TenVietTat ten2) {
                if (ten1.getTen().compareTo(ten2.getTen()) == 0) {
                    return ten1.getHo().compareTo(ten2.getHo());
                }
                return ten1.getTen().compareTo(ten2.getTen());
            }
        });

        int t1 = Integer.parseInt(in.nextLine());
        while (t1-- > 0) {
            String vietTat = in.nextLine();
            arr.forEach(item -> {
                if (item.check(vietTat)) {
                    System.out.println(item);
                }
            });
        }
    }
}
