/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author nguyenquanghuy
 */
public class Main {

    public static void main(String[] args) throws FileNotFoundException {
//        /Users/nguyenquanghuy/Desktop/pro/src/main/java/bai2/MATRIX.in
        Scanner in = new Scanner(new File("MATRIX.in"));

        int t = in.nextInt();
        
        while (t-- > 0) {
            int n = in.nextInt();
            int m = in.nextInt();
            int i = in.nextInt();
            int[][] arr = new int[n][m];
            
            i--;
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    int p = in.nextInt();
                    arr[j][k] = p;
                }
            }
            
            handle(arr, i, m, n);
        }
    }
    
    private static void handle (int[][] arr, int i, int m, int n) {
        for (int j = 0; j < n; j++) {
            for (int k = j+1; k < n; k++) {
                if(arr[j][i] > arr[k][i]) {
                    int temp = arr[j][i];
                    arr[j][i] = arr[k][i];
                    arr[k][i] = temp;
                }
            }
        }
        
        for (int j = 0; j < n; j++) {
            for (int k = 0; k < m; k++) {
                System.out.print(arr[j][k] + " ");
            }
            System.out.println("");
        }
    }

}
