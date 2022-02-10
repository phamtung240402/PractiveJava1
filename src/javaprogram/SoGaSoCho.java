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
public class SoGaSoCho {
    public static void main(String[] args)
    {
        int a,b;
        for(a=0;a<=36;a++)
        {
            for(b=9;b<=25;b++)
            {
                if(a+b==36 && 2*a+4*b==100)
                System.out.println("So ga la: "+a+" va so cho la: "+b+"");
            }
        }
    }
}
