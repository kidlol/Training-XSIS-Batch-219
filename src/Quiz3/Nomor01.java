package Quiz3;

import java.util.Scanner;

public class Nomor01
{
    public static void main(String[] args)
    {
        int a,value;
        double sum =0,avg;
        Scanner scan = new Scanner(System.in);
        System.out.print("Input Looping : ");
        a = scan.nextInt();

        for (int i = 0; i <a ; i++)
        {
            System.out.print("Input Value : ");
            value = scan.nextInt();
            sum = sum + value;
        }
        avg = sum/a;
        System.out.println("Sum of Value : " + sum);
        System.out.println("Average of Value : " + avg);
    }
}
