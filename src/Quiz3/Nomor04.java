package Quiz3;

import java.util.Scanner;

public class Nomor04
{
    public static void main(String[] args)
    {
        int a,b =0;
        Scanner scan = new Scanner(System.in);

        System.out.print("Input Values Looping : ");
        a = scan.nextInt();

        for (int i = 0; i <a ; i++)
        {
            System.out.print("Input Values Numeric : ");
            b = scan.nextInt();
        }
        System.out.println(b);
    }
}
