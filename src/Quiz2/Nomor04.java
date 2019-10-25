package Quiz2;

import java.util.Scanner;

public class Nomor04
{
    public static void main(String[] args)
    {
        String c;
        Scanner scan = new Scanner(System.in);

        System.out.print("Input Your Text : ");
        c = scan.nextLine();

        if (c.length() > 20)
        {
            System.out.println("Your Text Have Many Character");
        }
        else
        {
            System.out.println("Your Text Have Less Character");
        }

        System.out.println(c.length());
    }
}
