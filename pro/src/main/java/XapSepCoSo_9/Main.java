/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package XapSepCoSo_9;

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
//        /Users/nguyenquanghuy/Desktop/pro/src/main/java/XapSepCoSo_9/SINHVIEN.IN
///Users/nguyenquanghuy/Desktop/pro/src/main/java/XapSepCoSo_9/DETAI.in
///Users/nguyenquanghuy/Desktop/pro/src/main/java/XapSepCoSo_9/NHIEMVU.in
        Scanner sv = new Scanner(new File("SINHVIEN.in"));
        Scanner dt = new Scanner(new File("DETAI.in"));
        Scanner nv = new Scanner(new File("NHIEMVU.in"));

        int tsv = sv.nextInt();
        int tdt = dt.nextInt();
        int tnv = nv.nextInt();
        sv.nextLine();
        dt.nextLine();
        nv.nextLine();

        ArrayList<SinhVien> arrSV = new ArrayList<SinhVien>();
        ArrayList<DeTai> arrDT = new ArrayList<DeTai>();
        ArrayList<NhiemVu> arrNV = new ArrayList<NhiemVu>();

        while (sv.hasNextLine()) {
            SinhVien s = new SinhVien(sv.nextLine(), sv.nextLine(), sv.nextLine(), sv.nextLine());
            arrSV.add(s);
        }
        
        while (dt.hasNextLine()) {
            DeTai s = new DeTai(dt.nextLine(), dt.nextLine());
            arrDT.add(s);
        }
        arrDT.sort((o1, o2) -> o1.getTen().compareTo(o2.getTen()));

        while (nv.hasNextLine()) {
            NhiemVu s = new NhiemVu(nv.next(), nv.next());
            nv.nextLine();
            arrNV.add(s);
        }

        for (int i = 0; i < tsv; i++) {
            SinhVien s = arrSV.get(0);
            DeTai d = arrDT.get(i);
            NhiemVu n;

            for (NhiemVu nhiemVu : arrNV) {
                if (nhiemVu.getMaDt().equals(d.getMa())) {
                    for (SinhVien sinhVien : arrSV) {
                        if (sinhVien.getMa().equals(nhiemVu.getMaSv())) {
                            s = sinhVien;
                            n = nhiemVu;
                        }
                    }
                }
            }

            System.out.println("" + s.getMa() + " " + s.getHoTen() + " "
                    + s.getSdt() + " " + s.getEmail() + " " + d.getGv() + " " + d.getTen());
        }
    }
}
