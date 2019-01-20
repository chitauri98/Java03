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
public class Bai1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so : ");
        double num = input.nextDouble();
        System.out.println("Binh phuong cau so do la :");
        System.out.printf("%.1f^2=%.1f\n",num, num*num);

    }
    
}
    

