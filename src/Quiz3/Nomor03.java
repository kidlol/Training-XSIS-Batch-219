package Quiz3;

import java.util.Scanner;

public class Nomor03
{
    public static void main(String[] args)
    {
        int value;
        double sum = 0,avg;
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i <5 ; i++)
        {
            System.out.print("Input Values : ");
            value = scan.nextInt();
            if (value >= 100 && value <= 999)
            {
                /*System.out.println("Your Input Values : " + value);*/
                sum = sum + value;
            }
            else
            {
                System.out.println("Out Of Range");
            }

        }
        avg = sum / 5;
        System.out.println("Sum of Values : " + sum);
        System.out.println("Average of Values : " + avg);
    }
}
