package HomeWork;

import java.util.Scanner;

public class Nomor04
{
    public static void main(String[] args)
    {
        int bilangan,hasil;
        Scanner scan = new Scanner(System.in);
        System.out.print("Input an Integer : ");
        bilangan = scan.nextInt();
        hasil = (bilangan % 2) + 1;
        System.out.println("Display Result : " + hasil);
    }
}
