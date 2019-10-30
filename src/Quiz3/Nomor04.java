package Quiz3;

import java.util.Scanner;

public class Nomor04
{
    public static void main(String[] args)
    {
        int i, j = 0;
        Scanner scan = new Scanner(System.in);
        String k="";

        do
        {
            System.out.print("Input Number (Except = 0) : ");
            i = scan.nextInt();
            if (i != 0 )
            {
                k = k + i + " ";
            }
        }
        while (i != 0);
        System.out.println("Display (Except 0) : " + k);
    }
}
