package com.xsis.day3.lopping;


import java.util.Scanner;

public class While04
{
    public static void main(String[] args)
    {
        int a, sum = 0,i;
        Scanner scan = new Scanner(System.in);
        i = 1;

        while (i <= 5)
        {
            System.out.print("Masukkan Nomor : ");
            a = scan.nextInt();
            if (i % 2 == 0)
            {
                sum = sum + a;
            }
            else
            {
                System.out.println("Masukkan Nomor Yang Lain..!!");
            }
            i++;
        }
        System.out.println("Total : " + sum);
    }
}
