/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code.buoi.pkg4;

import java.util.Scanner;

/**
 *
 * @author Maximus
 */
public class Bai2 {
    public static void main(String[] args) {
        int n;
        Scanner input=new Scanner(System.in);
        System.out.print("Nhập n = ");
        n=input.nextInt();
        int factorial=1;
        for (int i = n; i > 0; i--) {
            factorial=i*factorial;
        }
        System.out.println(n+"! = "+factorial);
    }
    
}
