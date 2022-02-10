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
public class PhuongTrinhBac1 {
    public static void main(String[] args)
    {
        double a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap a=");
        a=sc.nextDouble();
        System.out.println("Nhap b=");
        b=sc.nextDouble();
        if(a != 0)
            System.out.println("Phuong trinh co nghiem duy nhat x=");
        else if(a==0 && b==0)
            System.out.println("Phuong trinh co vo so nghiem");
        else if(a==0 && b!=0)
            System.out.println("Phuong trinh vo nghiem");
}
