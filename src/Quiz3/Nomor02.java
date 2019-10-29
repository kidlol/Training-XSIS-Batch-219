package Quiz3;

import java.util.Scanner;

public class Nomor02
{
    public static void main(String[] args)
    {
        int a,b;
        Scanner scan = new Scanner(System.in);
        System.out.print("Input Looping : ");
        a = scan.nextInt();

        for (int i = 0; i <a ; i++)
        {
            System.out.print("Input Value : ");
            b = scan.nextInt();
            if (b % 2 == 0)
            {
                System.out.println("Your input value is Even Number");
            }
            else
            {
                System.out.println("Your input from another world");
            }
        }
    }
}
