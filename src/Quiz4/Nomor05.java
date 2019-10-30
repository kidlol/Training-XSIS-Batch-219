package Quiz4;

import java.util.Scanner;

public class Nomor05
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int[] a = new int[5];
        initArray(a,scan);
        showArray(a);

    }

    static void initArray(int[] a,Scanner scan)
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

    static void functionArray(int[] a)
    {
        int n = 0;
        for (int i = 0; i <a.length ; i++)
        {
            if (a[i] >= 0 )
            {
                a[i] += n;
                System.out.println("Lakukan Penjumlahan : " + n);
            }
            else if (a[i] > 10)
            {
                System.out.println("Its greater then 10 < " + a[i]);
            }
            else
            {
                System.out.println("Please Input Another Number ");
            }
        }
    }
}
