package com.xsis.day2.math;

import java.util.Scanner;

public class Math02
{
    public static void main(String[] args)
    {
        double s,a,t;
        Scanner scan = new Scanner(System.in);
        System.out.print("Jarak : ");
        s = scan.nextDouble();

        System.out.print("Percepatan : ");
        a = scan.nextDouble();

        t = Math.sqrt(2 * s / a);
        System.out.println("Waktu Mobil yang di tempuh dalam " +s+" jarak, " +a+ " percepatan adalah " +t+ " detik" );
        System.out.println("Waktu Mobil yang di tempuh dalam " +s+" jarak, " +a+ " percepatan adalah " +Math.round(t)+ " detik" );
    }
}
