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
public class Bai5 {public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap a : ");
        int a = input.nextInt();
        System.out.println("Ket qua :");
        System.out.println( a % 2 == 0 ? 
                "a la so chan" : "a la so le");
    }
    
}
