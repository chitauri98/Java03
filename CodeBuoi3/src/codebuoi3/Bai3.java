/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codebuoi3;

import java.util.Scanner;

/**
 *
 * @author Maximus
 */
public class Bai3 {public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap a : ");
        int a = input.nextInt();
        
        System.out.print("Nhap b : ");
        int b = input.nextInt();
        
        System.out.println("Ket qua :");
       
        System.out.println(a > b ? "a > b" : 
                (a < b ? "a < b" : "a = b"));
    }

    
}
