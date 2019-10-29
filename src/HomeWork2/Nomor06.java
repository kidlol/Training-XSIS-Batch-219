package HomeWork2;

import javax.lang.model.util.ElementScanner6;
import java.util.Scanner;

public class Nomor06
{
    public static void main(String[] args)
    {
        int a,b,c,s;
        Scanner scan = new Scanner(System.in);

        System.out.print("Input Panjang : ");
        a = scan.nextInt();
        System.out.print("Input Panjang : ");
        b = scan.nextInt();
        System.out.print("Input Panjang : ");
        c = scan.nextInt();

        if (a + b + c == 180)
        {
            System.out.println(a + "+" + b + "+" + c + " = 180 ");
            System.out.println("Termasuk Sudut-sudut Segitiga");
        }
        else if (a + b + c > 180)
        {
            System.out.println(a + "+" + b + "+" + c + " = 180 ");
            System.out.println("Lebih Dari Sudut-sudut Segitiga");
        }
        else
        {
            System.out.println(a + "+" + b + "+" + c + " = 180 ");
            System.out.println("Tidak Mencakup Sudut-sudut Segitiga");
        }
    }
}
