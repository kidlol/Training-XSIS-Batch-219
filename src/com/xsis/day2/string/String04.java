package com.xsis.day2.string;

public class String04
{
    public static void main(String[] args)
    {
        String s,st,ss,l,u;
        s = "Hello .NET Developer Welcome To Xsis Academy";
        System.out.println(s);
        st = s.replace(".NET","JAVA");
        System.out.println(st);
        ss = s.replace("Hello","Welcome");
        System.out.println(ss);
        l = s.toLowerCase();
        System.out.println(l);
        u = s.toUpperCase();
        System.out.println(u);

    }
}
