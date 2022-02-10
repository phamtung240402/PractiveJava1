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
public class bth19 {
    public static void main(String[] args)
    {
        int x,n;
        double s=0;
        int mau=1;
        Scanner sc=new Scanner(System.in);
        do{
        System.out.print("Nhap n=");
        n=sc.nextInt();
        }while(n<=0);
        System.out.print("Nhap x=");
        x=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            mau*=i;
            s+=Math.pow(x, i)/mau;
        }
        System.out.println("Gia tri cua day so la: " + s );
    }
}
