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
public class bth118 {
    public static void main(String[] args)
    {
        int[] a;
        a=new int[100];
        int n;
        int x;
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap n= ");n=sc.nextInt();
        for(int i=0;i<=n;i++)
        {
            System.out.print("a["+i+"]=");
            a[i]=sc.nextInt();
        }
        System.out.print("Nhap x= ");x=sc.nextInt();
        for(int i=0;i<=n;i++)
        {
            for(int j=i+1;j<=n;j++)
            {
                if(a[i]+a[j] == x)
                {
                    System.out.println(""+a[i]+" va "+a[j]+"");
                }
            }
        }
    }
}
