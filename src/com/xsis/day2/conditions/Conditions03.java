package com.xsis.day2.conditions;

import java.util.Scanner;

public class Conditions03
{
    public static void main(String[] args)
    {
        int days,month;
        Scanner scan = new Scanner(System.in);

        System.out.println("Input Bulan : ");
        month =scan.nextInt();

        if (month == 2)
        {
            days = 28;
        }
        else if (month == 4 || month == 6 || month == 9 || month == 11)
        {
            days = 30;
        }
        else
        {
            days = 31;
        }
    }
}
