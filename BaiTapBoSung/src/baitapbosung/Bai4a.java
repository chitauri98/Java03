/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapbosung;

import java.util.Scanner;

/**
 *
 * @author Maximus
 */
public class Bai4a { 
    public static void main(String[] args) {
        int h;
        Scanner input=new Scanner(System.in);
        System.out.print("Nhập đọ cao h = ");
        h=input.nextInt();
        for(int i=0;i<h;i++){
            for(int j=0;j<2*h+1;j++){
                if(h-i<=j&&j<=h+i){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
                
            }
            System.out.println("");
        }
    }
    
}
