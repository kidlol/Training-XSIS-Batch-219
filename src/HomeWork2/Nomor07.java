package HomeWork2;

import java.util.Scanner;

public class Nomor07
{
    public static void main(String[] args)
    {
        /*int a = 3;
        int b = 4;
        int c = 5;*/
        int a,b,c;
        Scanner scan = new Scanner(System.in);

        System.out.print("Input Sis 1 : ");
        a = scan.nextInt();
        System.out.print("Input Sis 2 : ");
        b = scan.nextInt();
        System.out.print("Input Sis 3 : ");
        c = scan.nextInt();

        if (a == Math.sqrt((c*c)-(b*b)) && b == Math.sqrt((c*c)-(a*a)) && c == Math.sqrt((a*a)+(b*b)))
        {
            System.out.println("Termasuk Sisi Panjang Segitiga Siku-siku");
        }
        else
        {
            System.out.println("Bukan Termasuk Sisi Panajang Siku-siku");
        }
    }
}
