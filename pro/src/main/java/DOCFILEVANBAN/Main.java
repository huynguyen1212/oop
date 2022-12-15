/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DOCFILEVANBAN;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author nguyenquanghuy
 */
public class Main {

    public static void main(String[] args) throws FileNotFoundException {
//        /Users/nguyenquanghuy/Desktop/pro/src/main/java/DOCFILEVANBAN/DATA.in
        Scanner in = new Scanner(new File("DATA.in"));
        while (in.hasNextLine()) {
            System.out.println(in.nextLine());
        }
    }

}
