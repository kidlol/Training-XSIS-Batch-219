package Quiz2;

import java.util.Scanner;

public class Nomor01
{
    public static void main(String[] args)
    {
        int a;
        Scanner scan = new Scanner(System.in);

        System.out.print("Input Your Number : ");
        a = scan.nextInt();

        if (a > 0)
        {
            System.out.println("Posotive");
        }
        else
        {
            System.out.println("Negative");
        }
    }
}
