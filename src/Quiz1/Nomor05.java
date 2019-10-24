package Quiz1;

import java.util.Scanner;

public class Nomor05
{
    static final double cf = 32;
    static final double cd = 1.8;
    public static void main(String[] args)
    {
        double farenheit, celcius;
        Scanner scan = new Scanner(System.in);

        System.out.print("Input Temperature in Farenheit : ");
        farenheit = scan.nextDouble();
        celcius = (farenheit - cf)/cd;

        System.out.println("Temperature in Celcius : " + celcius);
    }
}
