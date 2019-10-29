package com.xsis.day3.lopping;

import java.util.Scanner;

public class For02
{
    public static void main(String[] args)
    {
        int a;
        Scanner scan = new Scanner(System.in);

        System.out.print("How Many Loop : ");
        a = scan.nextInt();
        for (int i = 0; i < a; i++)
        {
            System.out.println("I : "+ i);
        }
    }
}
