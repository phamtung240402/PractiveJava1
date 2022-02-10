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
public class phuongtrinhbac2 {
    public static void main(String[] args)
    {
    float a,b,c;
    double s;
    Scanner sc=new Scanner(System.in);
    System.out.print("Nhap a=");
    a=sc.nextFloat();
    System.out.print("Nhap b=");
    b=sc.nextFloat();
    System.out.print("Nhap c=");
    c=sc.nextFloat();
    if(a==0) {
        if(b != 0 && c!=0)
            System.out.println("Phuong trinh co nghiem duy nhat x="+((-c)/b));
        else if(b==0 && c==0)
            System.out.println("Phuong trinh co vo so nghiem");
        else if(b==0 && c!=0)
            System.out.println("Phuong trinh vo nghiem");
    }
    else if(a!=0)
    {
    s=Math.pow(b,2)-4*a*c;
    if(s>0)
    {
        System.out.print("Phuong trinh co 2 nghiem phan biet");
        System.out.println("x1=" + ((-b+Math.sqrt(s))/(2*a)));
        System.out.println("x2=" + ((b+Math.sqrt(s))/(2*a)));   
    }
    else if(s<0)
        System.out.println("Phuong trinh vo nghiem");
    else if(s==0)
    {
        System.out.println("Phuong trinh co nghiem kep");
        System.out.println("x=" + ((-b)/(2*a)));
    }
}
    }