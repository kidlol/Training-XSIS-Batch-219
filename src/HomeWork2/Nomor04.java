package HomeWork2;

import java.util.Scanner;

public class Nomor04
{
    public static void main(String[] args)
    {
        int a;
        Scanner scan = new Scanner(System.in);

        System.out.print("Input Number : ");
        a = scan.nextInt();

        if (a >= 1000 && a <= 9999)
        {
            System.out.println(a + " Your Number in Range ");
        }
        else
        {
            System.out.println(a + " Your Number Out of Range");
        }
    }
}
