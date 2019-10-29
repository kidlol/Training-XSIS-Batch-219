package com.xsis.day3.lopping;

import java.util.Scanner;

public class while03
{
    public static void main(String[] args)
    {
        double p = 5.5,a;
        int i = 1;
        Scanner scan = new Scanner(System.in);

        while ( i < 3)
        {
            System.out.print("Input Number : ");
            a = scan.nextDouble();
            p = p * a;
            i++;
        }
        System.out.println("p : " +p);
    }
}
