package HomeWork;

import java.util.Scanner;

public class Nomor07
{
    static final double mile = 63360;
    static final double yard = 36;
    static final double feet = 12;
    public static void main(String[] args)
    {
        int distance, sisa, result1, result2, result3,result4;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Your Distance : ");
        distance = scan.nextInt();

        result1 = (int) (distance / mile);
        sisa = (int) (distance % mile);

        result2 = (int) (sisa / yard);
        sisa = (int) (sisa % yard);

        result3 = (int) (sisa / feet);
        sisa = (int) (sisa % feet);

        result4 = sisa / 1;
        sisa = sisa % 1;

        System.out.println("Your Distance in Mile : " +result1+ " in Yard : " +result2+ " in Feet : " +result3+ " in Inches " +result4);
    }
}
