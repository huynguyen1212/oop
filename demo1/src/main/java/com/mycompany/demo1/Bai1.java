/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.demo1;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
              
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            
            System.out.println(fibonacci(arr[i]));
        }
        
              
        
      
    }
    public static long fibonacci(int n) {
        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            return (fibonacci(n - 1) + fibonacci(n - 2))%1000000007;
        }
    }
}

demotreeset