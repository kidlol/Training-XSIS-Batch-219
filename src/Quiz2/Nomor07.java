package Quiz2;

import java.util.Scanner;

public class Nomor07
{
    public static void main(String[] args)
    {
        int a,b,c,avg;

        Scanner scan = new Scanner(System.in);
        System.out.print("Suhu di Daerah Malang : ");
        a = scan.nextInt();
        System.out.print("Suhu di Daerah Surabaya : ");
        b = scan.nextInt();
        System.out.print("Suhu di Daerah Jakarta : ");
        c = scan.nextInt();

        avg = a+b+c/3;

        System.out.println("Rata-Rata Suhu : " + avg);
        if (avg > 60)
        {
            System.out.println("Heat Wave");
        }
        else
        {
            System.out.println("Cold Wave");
        }
    }
}
