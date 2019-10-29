package HomeWork2;

import java.util.Scanner;

public class Nomor18
{
    public static void main(String[] args)
    {
        int cd;
        Scanner scan = new Scanner(System.in);

        System.out.println("Input amount of CDs in a Month : ");
        cd = scan.nextInt();

        if (cd == 1)
        {
            System.out.println("Congrats!! you Got Rewards 3 points");
        }
        else if (cd == 2)
        {
            System.out.println("Congrats!! you Got Rewards 10 points");
        }
        else if (cd == 3)
        {
            System.out.println("Congrats!! you Got Rewards 20 points");
        }
        else if (cd >= 4)
        {
            System.out.println("Congrats!! you Got Rewards 45 points");
        }
        else
        {
            System.out.println("Did you Purchase some CD..??");
        }
    }
}
