package Quiz2;

import java.util.Scanner;

public class Nomor05
{
    public static void main(String[] args)
    {
        int a,b,c,d;
        Scanner scan = new Scanner(System.in);

        System.out.print("Input Your First Number : ");
        a = scan.nextInt();
        System.out.print("Input Your Second Number : ");
        b = scan.nextInt();
        System.out.print("Input Your Third Number : ");
        c = scan.nextInt();
        System.out.print("Input Your Fourth Number : ");
        d = scan.nextInt();

        if (a > 0 && b > 0 && c > 0 && d > 0)
        {
            System.out.println("Your Number is Positive");
        }
        else
        {
            System.out.println("Among The Given Numbers, There is a Negative One!");
        }
    }
}
