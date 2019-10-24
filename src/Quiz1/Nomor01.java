package Quiz1;

import java.util.Scanner;

public class Nomor01
{
    static final int sudut = 180;
    public static void main(String[] args)
    {
        int a,b,c;
        Scanner scan = new Scanner(System.in);
        System.out.print("Sudut a : ");
        a = scan.nextInt();
        System.out.print("Sudut b : ");
        b = scan.nextInt();
        c = sudut - (a+b);

        System.out.println("Sudut Ke 3 : " + c);
    }
}
