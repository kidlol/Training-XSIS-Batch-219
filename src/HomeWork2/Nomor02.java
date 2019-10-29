package HomeWork2;

import java.net.SecureCacheResponse;
import java.util.Scanner;

public class Nomor02
{
    static final int x = 6;
    static final int z = 7;

    public static void main(String[] args)
    {
        int a;
        Scanner scan = new Scanner(System.in);

        System.out.print("Inputkan Nomor :");
        a = scan.nextInt();

        if (a % x == 0 && a != 0)
        {
            System.out.println("Termasuk Kelipatan 6");
        }
        else if (a % z == 0 && a != 0)
        {
            System.out.println("Termasuk Kelipatan 7");
        }
        else
        {
            System.out.println("Bukan Termasuk Kelipatan 6 atau 7");
        }
    }
}
