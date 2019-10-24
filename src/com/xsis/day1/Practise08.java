package com.xsis.day1;

import java.util.Scanner;

public class Practise08
{
    static final double cf = 459.67;
    static final double cd = 1.8;
    public static void main(String[] args)
    {
        double farenheit, kelvin;
        Scanner scan = new Scanner(System.in);

        System.out.print("Input Temperature in Farenheit : ");
        farenheit = scan.nextDouble();
        kelvin = (farenheit + cf)/cd;

        System.out.println("Temperature in Kelvin : " + kelvin);
    }
}
