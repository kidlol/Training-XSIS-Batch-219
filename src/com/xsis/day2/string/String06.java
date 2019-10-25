package com.xsis.day2.string;

public class String06
{
    public static void main(String[] args)
    {
        String s,r1;
        s = "Hello Java Programmer";
        r1 = "Suffle : " + s.substring(11,21)+" "+s.substring(0,6)+s.substring(6,10);
        System.out.println(s);
        System.out.println(r1);
    }
}
