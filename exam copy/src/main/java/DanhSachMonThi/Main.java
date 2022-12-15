/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DanhSachMonThi;

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
        ///Users/nguyenquanghuy/Desktop/exam/src/main/java/DanhSachMonThi/MONHOC.in
        Scanner in = new Scanner(new File("MONHOC.in"));
        int t = Integer.parseInt(in.nextLine());
        
        ArrayList<MonThi> arr = new ArrayList<MonThi>();
        
        while (t-- > 0) {
            MonThi monThi = new MonThi(in.nextLine(), in.nextLine(), in.nextLine());
            arr.add(monThi);
        }
        
        arr.sort((MonThi m1, MonThi m2) -> m1.getMaMon().compareTo(m2.getMaMon()));
        arr.forEach(item -> System.out.println(item));
    }
}
