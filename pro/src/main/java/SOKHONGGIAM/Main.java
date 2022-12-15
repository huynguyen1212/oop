/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SOKHONGGIAM;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author nguyenquanghuy
 */
public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in1 = new Scanner(new File("/Users/nguyenquanghuy/Desktop/pro/src/main/java/SOKHONGGIAM/DATA1.in"));
        Scanner in2 = new Scanner(new File("/Users/nguyenquanghuy/Desktop/pro/src/main/java/SOKHONGGIAM/DATA2.in"));

        int t1 = Integer.parseInt(in1.nextLine());
        int t2 = Integer.parseInt(in2.nextLine());

        var arr1 = new ArrayList<Integer>();
        var arr2 = new ArrayList<Integer>();

        while (t1-- > 0) {
            int s = Integer.parseInt(in1.nextLine());
            arr1.add(s);
        }

        while (t2-- > 0) {
            int s = Integer.parseInt(in2.nextLine());
            arr2.add(s);
        }

        for (int i = 0; i < arr1.size(); i++) {
            int t = arr1.get(i);
            while (t / 10 > 0) {
                if (t % 10 < (t / 10) % 10) {
                    arr1.remove(i);
                }
                t = t / 10;
            }
        }

        for (int i = 0; i < arr2.size(); i++) {
            int t = arr2.get(i);
            while (t / 10 > 0) {
                if (t % 10 < (t / 10) % 10) {
                    arr2.remove(i);
                }
                t = t / 10;
            }
        }

        arr1.sort((o1, o2) -> {
            return o1.compareTo(o2);
        });
        arr2.sort((o1, o2) -> {
            return o1.compareTo(o2);
        });

        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < arr1.size(); i++) {
            if (arr1.get(i) == arr1.get(i + 1)) {
                count1++;
            }
            for (int j = 0; j < arr2.size(); j++) {
                if (arr1.get(i) == arr2.get(j)) {
                    if (arr2.get(i) == arr2.get(i + 1)) {
                        count2++;
                    }
                }
            }

        }
    }
}
