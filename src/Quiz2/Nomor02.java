package Quiz2;

import java.util.Scanner;

public class Nomor02
{
    public static void main(String[] args)
    {
        int a,b;
        Scanner scan = new Scanner(System.in);

        System.out.print("Input Your First Number : ");
        a = scan.nextInt();
        System.out.print("Input Your Second Number : ");
        b = scan.nextInt();

        if (a > 0 && b > 0)
        {
            System.out.println("Positive");
        }
        else
        {
            System.out.println("Negative");
        }
    }
}
