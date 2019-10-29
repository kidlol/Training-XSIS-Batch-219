package Quiz3;

import java.util.Scanner;

public class Nomor07
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String kata;

        int i = 0, count = 1;
        System.out.print("Masukkan Kata : ");
        kata = scan.nextLine();
        while (i<kata.length())
        {
            if (kata.charAt(i) == ' ')
            {
                count ++;
            }
            i ++;
        }
        System.out.println("Jumlah Kata : " + count);

    }
}
