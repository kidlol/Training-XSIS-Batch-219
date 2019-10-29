package HomeWork2;

import java.util.Scanner;

public class Nomor01
{
    static final int x = 6;

    public static void main(String[] args)
    {
        int v,m;
        Scanner scan = new Scanner(System.in);

        System.out.print("Input Your Number : ");
        v = scan.nextInt();

        m = v % x;

        if (m == 0)
        {
            System.out.println("Your Number is Multiple of 6");
        }
        else
        {
            System.out.println("Your Number is Not Multiple of 6");
        }

    }
}
