package com.xsis.day1;

import java.util.Scanner;

public class Practice09
{
    public static void main(String[] args) {
        int bilangan, digit1, digit2, digit3, digit4, sisa, totaljumlah;
        Scanner scan = new Scanner(System.in);
        System.out.print("Inputan Bilangan : ");
        bilangan = scan.nextInt();

        digit1 = bilangan/1000;
        sisa = bilangan % 1000;
        System.out.println("Digit 1 : " + digit1 + " | Sisa " + sisa);

        digit2 = sisa/100;
        sisa = bilangan % 100;
        System.out.println("Digit 2 : " + digit2 + " | Sisa " + sisa);

        digit3 = sisa/10;
        sisa = bilangan % 10;
        System.out.println("Digit 3 : " + digit3 + " | Sisa " + sisa);

        digit4 = sisa/1;
        sisa = bilangan % 1;
        System.out.println("Digit 3 : " + digit4 + " | Sisa " + sisa);

        System.out.println("________________________________________");
        totaljumlah = digit1 + digit2 + digit3 + digit4;
        System.out.println("Total Jumlah : " + totaljumlah);
    }
}
