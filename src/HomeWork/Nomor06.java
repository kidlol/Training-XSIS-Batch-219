package HomeWork;

import java.util.Scanner;

public class Nomor06
{
    static final int f=20;
    static final int s=10;
    static final int t=5;

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int money,count,sisa,value1,value2,value3,value4;

        System.out.print("Enter Your Withdraw : ");
        money = scan.nextInt();

        value1 = money / f;
        sisa = money % f;

        value2 = sisa / s;
        sisa = sisa % s;

        value3 = sisa / t;
        sisa = sisa % t;

        value4 = sisa;
        sisa = sisa % 1;

        System.out.println("Your Withdraw "+value1+" Note of 20$ "+value2+" Note of 10$ "+value3+" Note of 5$ "+value4+" Note of 1$");
    }
}
