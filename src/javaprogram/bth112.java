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
public class bth112 {
    public static void main(String[] args)
    {
        float r;
        final float pi=3.14f;
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap r=");
        r=sc.nextFloat();
        if(r>0)
        {
            System.out.println("Chu vi hinh tron= " + (2*pi*r));
            System.out.println("Dien tich hinh tron= "+(pi*r*r));
        }
    }
}
