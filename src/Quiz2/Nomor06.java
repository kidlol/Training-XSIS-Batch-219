package Quiz2;

import java.util.Scanner;

public class Nomor06
{
    public static void main(String[] args)
    {
        int a,b;
        Scanner scan = new Scanner(System.in);

        System.out.print("Insert Number 1 : ");
        a = scan.nextInt();
        System.out.print("Insert Number 2 : ");
        b = scan.nextInt();

        if (a > b)
        {
            System.out.println(b + " " + a);
        }
        else
        {
            System.out.println(a + " " + b);
        }
    }
}
