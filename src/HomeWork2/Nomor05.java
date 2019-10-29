package HomeWork2;

import java.util.Scanner;

public class Nomor05
{
    public static void main(String[] args)
    {
        int a,b;
        Scanner scan = new Scanner(System.in);

        System.out.print("Input First Value : ");
        a = scan.nextInt();
        System.out.print("Input Second Value : ");
        b = scan.nextInt();

        if (a > b)
        {
            System.out.println(b + " More Small for " + a);
        }
        else if (b > a)
        {
            System.out.println(a + " More Small for " + b);
        }
        else
        {
            System.out.println("Maybe Your Value Invalid or Same");
        }
    }
}
