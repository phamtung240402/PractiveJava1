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
public class bai17 {
    public static void main(String[] args)
    {
        final float pi=3.1414f;
        float x;
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap vao so goc:");
        x=sc.nextFloat();
        float a;
        a=x*pi/180;
        System.out.println("sin("+x+")="+Math.sin(a));
        System.out.println("cos("+x+")="+Math.cos(a));
        System.out.println("tan("+x+")="+Math.tan(a));
        System.out.println("cot("+x+")="+(1/Math.tan(a)));
    }
}
