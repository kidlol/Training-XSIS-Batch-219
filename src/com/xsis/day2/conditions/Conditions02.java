package com.xsis.day2.conditions;

import java.util.Scanner;

public class Conditions02
{
    public static void main(String[] args)
    {
        /*int umur;
        *//*double ipk = 3.19;*//*
        double ipk;
        Scanner scan = new Scanner(System.in);
        System.out.print("Input Umur : ");
        umur = scan.nextInt();
        System.out.print("Nilai IPK : ");
        ipk = scan.nextDouble();

        if (umur > 20 && ipk > 3.01 && ipk < 3.5)
        {
            System.out.println("Anda Sudah Terdaftar");
        }
        else
        {
            System.out.println("Anda Belum Terdaftar");
        }*/

        int n;
        Scanner scan = new Scanner(System.in);
        System.out.print("Input Bilangan : ");
        n = scan.nextInt();

        if (n % 2 == 0)
        {
            System.out.println("Genap");
        }
        else
        {
            System.out.println("Ganjil");
        }
    }
}
