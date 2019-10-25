package com.xsis.day2.conditions;

import java.util.Scanner;

public class Conditions04
{
    public static void main(String[] args)
    {
        int score;
        char grade;
        Scanner scan = new Scanner(System.in);

        System.out.print("Input Score : ");
        score = scan.nextInt();

        if (score >= 90)
        {
            grade = 'A';
        }
        else if (score < 90 && score > 60)
        {
            grade = 'B';
        }
        else
        {
            grade = 'C';
        }
        System.out.println("Your Score in Grade : " +grade);
    }
}
