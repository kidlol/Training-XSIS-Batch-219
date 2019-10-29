package HomeWork2;

import java.util.Scanner;

public class Nomor13
{
    public static void main(String[] args)
    {
        int i;
        Scanner scan = new Scanner(System.in);

        System.out.print("Input Your Number : ");
        i = scan.nextInt();

        if (i >= 0 && i < 10)
        {
            System.out.println("Your Entered a 1-digit Number");
        }
        else if (i >= 10 && i < 100)
        {
            System.out.println("Your Entered a 2-digit Number");
        }
        else if (i >= 100 && i < 1000)
        {
            System.out.println("Your Entered a 3-digit Number");
        }
        else
        {
            System.out.println("Your Entered a 4-digit Number");
        }
    }
}
