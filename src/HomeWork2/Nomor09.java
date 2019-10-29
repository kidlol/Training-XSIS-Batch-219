package HomeWork2;

import java.util.Scanner;

public class Nomor09
{
    static final int bonus = 2;
    static final int time = 40;
    public static void main(String[] args)
    {
        int pay,hour,total,total1,overtime;
        Scanner scan = new Scanner(System.in);

        System.out.print("Input Gross Pay :  ");
        pay = scan.nextInt();
        System.out.println("________________________");

        System.out.print("Input your Time Work : ");
        hour = scan.nextInt();


        if (hour == time)
        {
            total = pay * time;
            System.out.println("Your Gross Pay : " + total + " in 40 Hours");
        }
        else if (hour > time)
        {
            overtime = hour - time;
            total = pay * time;
            total1 = (pay * overtime) * bonus + total;
            System.out.println("Your Gross Pay : " + total1 + " in 40 Hours");
        }
        else if (hour < time)
        {
            total = pay * hour;
            System.out.println("Your Gross Pay : " + total + " in " + hour + " Hours");
        }
        else
        {
            System.out.println("Did You Work in This Month..??");
        }

    }
}
