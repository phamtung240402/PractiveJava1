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
public class bth113 {
    public static void main(String[] args)
    {
        int x;
        int gio;
        int phut;
        int giay;
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap so giay= ");
        x=sc.nextInt();
        gio=x/3600;
        phut=(x%3600)/60;
        giay=(x%3600)%60;
        System.out.println("Thoi gian: "+gio+":"+phut+":"+giay+"");
    }
}
