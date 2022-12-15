/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TINHGIO;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nguyenquanghuy
 */
public class Main {

    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());

        ArrayList<TinhGio> list = new ArrayList<>();
        while (t-- > 0) {
            TinhGio temp = new TinhGio(in.nextLine(), in.nextLine(),
                    in.nextLine(), in.nextLine());
            list.add(temp);
        }

        list.sort((TinhGio o1, TinhGio o2) -> Long.compare(o2.getTongGioChoi(), o1.getTongGioChoi()));

        list.forEach(item -> System.out.println(item.toString()));
    }
}
