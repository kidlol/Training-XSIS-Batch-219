package com.xsis.day1;

import java.util.Scanner;

public class Practise03
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int panjang,lebar,luas;
        System.out.print("Panjang : ");
        panjang = scan.nextInt();
        System.out.print("Lebar : ");
        lebar = scan.nextInt();
        luas = panjang * lebar;

        System.out.println("luas Persegi Panjang : "+luas);
    }
}
