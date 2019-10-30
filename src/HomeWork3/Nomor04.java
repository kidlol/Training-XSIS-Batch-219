package HomeWork3;

import java.util.Scanner;

public class Nomor04
{
    public static void main(String[] args)
    {
//        int input, max = 0,min= 99;
//        Scanner scan = new Scanner(System.in);
//
//        do
//        {
//            System.out.print("Input Number (-99 to quit) : ");
//            input = scan.nextInt();
//            if (input>max)
//            {
//                max = input;
//            }
//            else if (input<min && input!=-99)
//            {
//                min=input;
//            }
//        }
//        while (input != -99);
//
//        System.out.println(max);
//        System.out.println(min);
        int input, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        Scanner scan = new Scanner(System.in);
        do
        {
            System.out.print("Input Number (-99 to quit) :");
            input = scan.nextInt();
            if (input > max)
            {
                max = input;
            }
            if (input < min && input != -99)
            {
                min = input;
            }
        }
        while (input != -99);

        System.out.println(max);
        System.out.println(min);
    }
}
