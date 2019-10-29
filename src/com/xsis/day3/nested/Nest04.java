package com.xsis.day3.nested;

import java.util.Scanner;

public class Nest04
{
    public static void main(String[] args)
    {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number : ");
        n = scan.nextInt();

        for (int i = 0; i <= n ; i++)
        {
            for (int j = 0; j <= n ; j++)
            {
                System.out.print("| ");
            }
            System.out.println();
        }
    }


}
