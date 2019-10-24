package com.xsis.day1;

import java.util.Scanner;

public class Practise05
{
    public static void main(String[] args)
    {
        double literPerKilo, jarakTempuh, bahanBakar;
        Scanner scan = new Scanner(System.in);
        System.out.print("Jumlah Bahan Bakar :");
        bahanBakar = scan.nextDouble();
        System.out.print("Jarak Yang di Tempuh :");
        jarakTempuh = scan.nextDouble();

        literPerKilo = bahanBakar/jarakTempuh;
        System.out.println("1 Kilo per " +literPerKilo);


    }
}
