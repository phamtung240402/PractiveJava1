package javaprogram;
import java.util.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author phamt
 */
public class b14TinhDienTich {
    public static void main(String[] args)
    {
        int a,b;
        Scanner sc=new Scanner(System.in);
        do{
        System.out.print("Nhap canh a= ");a=sc.nextInt();
        }while(a<=0);
         do{
        System.out.print("Nhap canh b= ");b=sc.nextInt();
        }while(b<=0);
        
        System.out.println("Dien tich= "+ a*a);
        System.out.println("Chu vi= "+ (2*(a+b)));
        
    }
}
