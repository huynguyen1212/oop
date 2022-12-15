/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.demo1;

import java.util.Scanner;

public class soNguyenTo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i]= sc.nextLong();
        }
        for (int i = 0; i < n; i++) {
            if(isPrime(a[i])) {
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        }
        
    }
    static  boolean isPrime(long num)
    {
        if(num<=1)
        {
            return false;
        }
       for(long i=2;i<=num/2;i++)
       {
           if((num%i)==0)
               return  false;
       }
       return true;
    }
}
