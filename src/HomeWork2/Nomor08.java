package HomeWork2;

import java.util.Scanner;

public class Nomor08
{
    static final double w = 8;
    public static void main(String[] args)
    {
        double p1,p2,p3,avg;
        Scanner scan = new Scanner(System.in);

        System.out.print("Input Jarak Pertama : ");
        p1 = scan.nextDouble();
        System.out.print("Input Jarak Kedua : ");
        p2 = scan.nextDouble();
        System.out.print("Input Jarak Ketiga : ");
        p3 = scan.nextDouble();

        avg = (p1 + p2 + p3)/3;
        if (avg >= w)
        {
            System.out.println(avg+" You'r Qualified!!!");
        }
        else
        {
            System.out.println("You'r Disqualified");
        }

    }
}
