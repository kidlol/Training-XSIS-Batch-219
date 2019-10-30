package HomeWork3;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicLong;

public class Nomor05
{
    public static void main(String[] args)
    {
        int a,b = 1,cost,total = 0;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your monthly budget : $");
        cost = scan.nextInt();

        System.out.println("Money spent this month (type -1 to quit");
        System.out.println("---------------------------------------");
        do
        {
            System.out.print("Enter Cost #"+b+": ");
            a = scan.nextInt();
            if (a != -1)
            {
                total = total + a;
                cost = cost - a;
            }
            b++;
        }
        while (a != -1);
        System.out.println("Total Cost : "+ total);
        System.out.println("Your are " + cost + " under your budget ");
    }
}
