/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package DanhSachMatHang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author nguyenquanghuy
 */
public class Main {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        
        ArrayList<MatHang> arr = new ArrayList<MatHang>();
        
        for (int i = 0; i < t; i++) {
            MatHang matHang = new MatHang(in.nextLine(), in.nextLine(), Long.parseLong(in.nextLine()), Long.parseLong(in.nextLine()));
            arr.add(matHang);
        }
        
        Collections.sort(arr, new Comparator<MatHang>() {
            @Override
            public int compare(MatHang m1, MatHang m2) {
                return (int) (m2.lai() - m1.lai());
            }
        });
        
        arr.forEach(item -> System.out.println(item.toString()));
    }
}
