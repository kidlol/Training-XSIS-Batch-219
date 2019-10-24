package com.xsis.day1;

import java.util.Scanner;

public class Practise02
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("FirstName : ");
        String firstName = scan.nextLine();
        System.out.println("LastName : ");
        String lastName = scan.nextLine();
        System.out.println("FullName : "+ firstName + lastName);
    }
}
