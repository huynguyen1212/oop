/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.demo1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author TienNH
 */
public class FibonacciTest {
    Demo2 fi;
    public FibonacciTest() {
        fi = new Demo2();
    }

    @org.junit.jupiter.api.Test
    public void testCalculateFi() {
        int t = fi.CalculateFi(10);
        int ex = 3;
        assertEquals(ex, t);
        
    }
    
    public void testCalculateFi2() {
        int t = fi.CalculateFi(11);
        int ex = 2;
        assertEquals(ex, t);
        
    }
    
}
