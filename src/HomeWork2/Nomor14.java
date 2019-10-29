package HomeWork2;

import java.util.Scanner;

public class Nomor14
{
    public static void main(String[] args)
    {
        int i;
        Scanner scan = new Scanner(System.in);

        System.out.print("Input Number of Month : ");
        i = scan.nextInt();

        if (i == 12 || i == 1 || i == 2)
        {
            System.out.println("Your Season is Winter");
        }
        else if (i == 3 || i == 4 || i == 5)
        {
            System.out.println("Your Season is Spring");
        }
        else if (i == 6 || i == 7 || i == 8)
        {
            System.out.println("Your Season is Summer");
        }
        else if (i == 9 || i == 10 || i == 11)
        {
            System.out.println("Your Season is Spring");
        }
        else
        {
            System.out.println("You Live in Another Planet");
        }
    }
}
