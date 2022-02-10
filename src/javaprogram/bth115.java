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
public class bth115 {
    public static void main(String[] args)
    {
    float diem;
    Scanner sc=new Scanner(System.in);
    System.out.print("Nhap diem:");diem=sc.nextFloat();
    if(diem<5) System.out.println("Hoc luc yeu");
    else if(diem>=5 && diem<6)
    {
       System.out.println("Hoc luc trung binh");
    }
    else if(diem>=6 && diem<7)
    {
            System.out.println("Hoc luc trung binh kha");
    }
    else if(diem>=7 && diem<8)
    {
            System.out.println("Hoc luc kha");
    }
    else if(diem>=8 && diem<9)
    {
            System.out.println("Hoc luc gioi");
    }
    else if(diem>=9 && 10>=diem)
    {
            System.out.println("Hoc luc xuat sac");
    }
    }  
}
