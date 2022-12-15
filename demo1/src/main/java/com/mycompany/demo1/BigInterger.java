/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.demo1;

import static com.mycompany.demo1.SapXepChen.In;
import java.util.Scanner;

/**
 *
 * @author TienNH
 */
public class BigInterger {
    public static void main(String[] args) {
        
      Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
              
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int key  = arr[i];
            int j = i-1;
            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j=j-1;
            }
            arr[j+1] = key;
            System.out.print("Buoc "+(i)+": ");
            In(arr,i+1);
            System.out.println("");
        }
      
    }
}
