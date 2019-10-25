package com.xsis.day2.string;

import java.util.Scanner;

public class String07
{
    public static void main(String[] args)
    {
        String username;
        int snumber;
        Scanner scan = new Scanner(System.in);
        System.out.print("Input Username : ");
        username = scan.nextLine();
        snumber = (int) (Math.random()* 100 + 100);
        System.out.println("Username : " + username);
        System.out.println("Password : " + username.substring(0,4)+snumber);
    }
}
