
package javaprogram;
import java.util.*;/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author phamt
 */
public class ThaoTacSo {
    public static void main(String[] args)
    {
        int a1,a2;
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap so thu nhat:");
        a1=sc.nextInt();
        System.out.print("nhap so thu hai:");
        a2=sc.nextInt();
        int c=a1+a2;
        System.out.print("Tong cua hai so "+a1+" va "+a2+" la " +c);
    }
}
