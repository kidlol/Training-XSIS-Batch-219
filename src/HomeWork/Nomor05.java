package HomeWork;

import java.util.Scanner;

public class Nomor05
{
    static final int week = 604800;
    static final int day = 86400;
    static final int hour = 3600;
    static final int minutes = 60;
    public static void main(String[] args)
    {
        int second, w,d,h,m,s,sisa;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Your Time :");
        second = scan.nextInt();

        w = second / week;
        sisa = second % week;

        d = sisa / day;
        sisa = sisa % day;

        h = sisa / hour;
        sisa = sisa % hour;

        m = sisa / minutes;
        sisa = sisa % minutes;

        s = sisa;
        sisa = sisa % 1;

        System.out.println("This is Time You Spend from "+w+" Week, "+d+" Days, "+h+" Hours, "+m+" Minutes, "+s+" Seconds");
    }
}
