/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.demo1;

import java.util.Scanner;

public class sapxepnoibot {
    public static void In(int a[],int n){
        for(int i=0;i<n;i++){
		          System.out.print(a[i]+" ");
	}
    }
    static void swapAb(int arr[],int i ,int j){
        int temp = arr[i];
        arr[i] = arr[j];
       arr[j] = temp;
    }
    public static void main(String[] args) {
        
      Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
              
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean haveSwap = false;
        for (int i = 0; i < n-1; i++) {
            haveSwap = false;
            for (int j = 0; j < n-i-1; j++) {
                if(arr[j] > arr[j+1]){
                    swapAb(arr,j,j+1);
                    haveSwap = true;
                }
            }
            if(haveSwap == false){break;}
            System.out.print("Buoc "+(i+1)+": ");
            In(arr,n);
            System.out.println("");
            
        }
      
    }
}
