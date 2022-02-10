/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaprogram;
import java.util.*;
/**
 *
 * @author phamt
 */
public class bth18 {
    public static void main(String[] args)
    {
       int a,b,c;
       Scanner sc=new Scanner(System.in);
       do{
        System.out.print("Nhap canh a=");a=sc.nextInt();
       }while(a<=0);
       do{
        System.out.print("Nhap canh b=");b=sc.nextInt();
       }while(b<=0);
        do{
        System.out.print("Nhap canh c=");c=sc.nextInt();
       }while(c<=0);
       
       if(a<(b+c) && b<(a+c) && c<(b+a))
       {
           System.out.println("a b c la 3 canh cua tam giac");
           System.out.println("Chu vi cua tam giac= "+ (a+b+c));
           double p=(a+b+c)/2;
           System.out.println("Dien tich tam giac= " + Math.sqrt(p*(p-a)*(p-b)*(p-c)));
       }
       else System.out.print("Khong phai hinh tam giac");
           
    }
}
