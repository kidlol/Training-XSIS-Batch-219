package Quiz1;

import java.util.Scanner;

public class Nomor06
{
    static final double value = 703;

    public static void main(String[] args)
    {
        double weight,heigth,bmi;
        Scanner scan = new Scanner(System.in);
        System.out.print("Input Your Weight : ");
        weight = scan.nextDouble();
        System.out.print("Input Your Heigth : ");
        heigth = scan.nextDouble();

        bmi = ((weight * value)/(heigth*heigth));
        System.out.println("Body Mass Index Yang di Dapat : " + bmi);

    }
}
