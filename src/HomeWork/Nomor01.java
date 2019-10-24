package HomeWork;

import java.util.Scanner;

public class Nomor01
{
    static final  int a=8;
    public static void main(String[] args)
    {
        int value, sisa, total;
        Scanner scan = new Scanner(System.in);

        System.out.print("Input Value : ");
        value = scan.nextInt();

        sisa = value % 10;
        total = sisa * 8;
        System.out.println("Your Result : " +total);
    }
}
