package HomeWork2;

import java.util.Scanner;

public class Nomor10
{
    static final int bonus = 2;
    static final int time = 40;
    static final double taxes = .3;

    public static void main(String[] args)
    {
        int pay,hour;
        double net,payBonus;
        Scanner scan = new Scanner(System.in);

        System.out.print("Input Gross Pay :  ");
        pay = scan.nextInt();
        System.out.println("________________________");

        System.out.print("Input your Time Work : ");
        hour = scan.nextInt();

        net = pay -(pay * taxes);
        payBonus = (pay * 2) - ((pay * 2)*taxes);
        if (hour == time)
        {
            System.out.println("Your Net Pay :" + net);
        }
        else if (hour > time)
        {
            System.out.println("Your Net Pay :" + payBonus);
        }
        else
        {
            System.out.println("You Can Get Gross Pay Until 40h Work");
        }
    }
}
