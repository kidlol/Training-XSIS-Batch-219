package Quiz2;

import java.util.Scanner;

public class Nomor03
{
    public static void main(String[] args)
    {
        String c;
        Scanner scan = new Scanner(System.in);

        System.out.print("Give Your Text : ");
        c = scan.nextLine();

        if (c.equals(c.toUpperCase()))
        {
            System.out.println("Your Text is Uppercase");
        }
        else
        {
            System.out.println("Your Text is Lowercase");
        }
    }
}
