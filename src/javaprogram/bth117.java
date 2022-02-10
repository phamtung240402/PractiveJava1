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
public class bth117 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        for(int i=2;i<=9;i++)
        {
            System.out.println("Bang cuu chuong cua "+i+"");
            for(int j=1;j<=10;j++)
            {
                System.out.println(""+i+"*"+j+"=" + (i*j));
            }
        }
        int k;
        System.out.print("Nhap so k= ");k=sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(""+k+"*"+i+"="+k*i);
        }
    }
}
