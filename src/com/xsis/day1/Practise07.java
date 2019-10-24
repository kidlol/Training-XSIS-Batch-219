package com.xsis.day1;

import java.util.Scanner;

public class Practise07
{
    public static void main(String[] args)
    {
        double itemAfterDiscount, discount, itemBeforeDiscount;
        Scanner scan = new Scanner(System.in);

        System.out.print("Harga Ikan Sebelum Diskon : ");
        itemBeforeDiscount = scan.nextDouble();

        System.out.print("Discount % :");
        discount = scan.nextDouble();

        itemAfterDiscount = itemBeforeDiscount - (itemBeforeDiscount * discount/100);
        System.out.println("Harga Ikan Setelah Discount : " + itemAfterDiscount);
    }
}
