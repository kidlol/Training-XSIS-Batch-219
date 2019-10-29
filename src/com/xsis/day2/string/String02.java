package com.xsis.day2.string;

import java.util.Scanner;

public class String02
{
    public static void main(String[] args)
    {
        String i,revers;
        char r1,r2,r3,r4;

        Scanner scan = new Scanner(System.in);
        System.out.print("Input Your Text : ");
        i = scan.nextLine();

        r1 = i.charAt(0);
        r2 = i.charAt(1);
        r3 = i.charAt(2);
        r4 = i.charAt(3);
        revers = ""+i.charAt(3)+i.charAt(2)+i.charAt(1)+i.charAt(0);
        System.out.println("Reverses Text : " +r4+r3+r2+r1);
        System.out.println("Reverses Text : " + revers);
        System.out.println(r1);
    }
}
