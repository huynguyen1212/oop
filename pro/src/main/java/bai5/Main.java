/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author nguyenquanghuy
 */
public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);

        Rectange r = new Rectange(in.nextDouble(), in.nextDouble(), in.next());
        if (r.getHeight() > 0 && r.getWidth() > 0) {
            System.out.println("" + (int) r.findPerimeter() + " " + (int) r.findArea() + " " + r.getColor());
        } else {
            System.out.println("INVALID");
        }
    }

}
