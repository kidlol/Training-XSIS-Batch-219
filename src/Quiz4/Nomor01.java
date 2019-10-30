package Quiz4;

import java.util.Scanner;

public class Nomor01
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int[] a = new int[5];
        initArray(a,scan);
        showArray(a);
        initPow(a);
        showArray(a);


    }

    static void initArray(int[] a, Scanner scan)
    {
        System.out.println("___Input Values___");
        for (int i = 0; i <a.length ; i++)
        {
            System.out.print("Value : ");
            a[i] = scan.nextInt();
        }
    }

    static void showArray(int[] a)
    {
        for (int i = 0; i <a.length ; i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    static void initPow(int[] a)
    {
        System.out.println("The Power of Three : ");
        for (int i = 0; i <a.length ; i++)
        {
            a[i] = (int) Math.pow(a[i],3);
        }
    }
}
