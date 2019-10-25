package com.xsis.day2.conditions;

public class Conditions01
{
    public static void main(String[] args)
    {
        String a, b,c,d;
        a = "xsis";
        b = "xsis";
        c = "buahno";
        d = "XSIS";

        if (b.equals(d))
        {
            System.out.println("Objek Sama Lur");
        }
        else
        {
            System.out.println("Objek Berbeda Lur");
        }

        if (a.equals(c))
        {
            System.out.println("false");
        }
        else
        {
            System.out.println("true");
        }
    }
}
