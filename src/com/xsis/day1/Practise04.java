package com.xsis.day1;

import java.util.Scanner;

public class Practise04
{
    static final double pi = 3.14;
    public static void main(String[] args)
    {
        double area, radius;
        Scanner scan = new Scanner(System.in);
        System.out.print("Radius : ");
        radius = scan.nextDouble();

        area = pi * (radius*radius);
        System.out.println("Luas Lingkaran : " +area);
    }
}
