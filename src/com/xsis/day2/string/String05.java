package com.xsis.day2.string;

public class String05
{
    public static void main(String[] args)
    {
        String s = "Hello Java Programmer";
        System.out.println("Lenght : " + s.length());

        //searching index.
        System.out.println("Index : " + s.indexOf("Java"));
        System.out.println("Index : " + s.indexOf("H"));

        //substr untuk get sebuah dari index ke -i s/d index ke j.
        System.out.println("Sub-String : " + s.substring(6,9));
        System.out.println("Sub-String : " + s.substring(6,11));
        //NB : substring tidak bisa di lakukan dari index yang di inginkan ke urutan ke belakang.

    }
}
