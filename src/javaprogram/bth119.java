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
public class bth119 {
    public static void main(String[] args)
    {
        float[] a;
        int n;
        a=new float[100];
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap n= ");n=sc.nextInt();
        for(int i=0;i<=n;i++)
        {
            System.out.print("a["+i+"]= ");a[i]=sc.nextInt();
        }
        System.out.println("Danh sach cac so hoan hao");
        int count=0;
        for(int i=0;i<=n;i++)
        {
            int tong=0;
            for(int j=1;j<a[i];j++)
            {
                if(a[i]%j==0)
                tong+=j;
            }
        if(tong==a[i])
        {
        count++;
        System.out.println(""+a[i]+"");
        }
        }
    if(count==0) System.out.println("Khong co so hoan hao trong day");
    }
}
