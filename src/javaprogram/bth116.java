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
public class bth116 {
    public static void main(String[] args)
    {
        int[] a;
        int n;
        a=new int[100];
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap n= ");
        n=sc.nextInt();
        for(int i=0;i<=n;i++)
        {
            System.out.print("a["+i+"]= ");
            a[i]=sc.nextInt();
        }
        int s=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<=n;j++)
            {
                if(a[i]<a[j]) s=0; else s++;
            }
        }
        int h=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<=n;j++)
            {
                if(a[i]>a[j]) h=0; else h++;
            }
        }
    if(s==0) System.out.println("Ham tang dan"); 
    else if(h==0) System.out.println("Ham giam dan");
    else System.out.print("Day khong tang khong giam");
    }
}
