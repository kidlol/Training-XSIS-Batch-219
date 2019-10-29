package Quiz3;

import java.util.Scanner;

public class Nomor06
{
    public static void main(String[] args)
    {
        int a,value;
        double avg,sum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Input Looping : ");
        a = scan.nextInt();

        for (int i = 0; i <a ; i++)
        {
            if (i != 0)
            {

            }
            System.out.print("Input Value : ");
            value = scan.nextInt();
            sum = sum + value;
        }
        avg = sum/a;
        System.out.println("Average of Value : " + avg);

    }
}
