package HomeWork;

import java.util.Scanner;

public class Nomor02
{
    public static void main(String[] args)
    {
        int bilangan, digit1, digit2, digit3, digit4,digit5, sisa, reversNumber;
        Scanner scan = new Scanner(System.in);
        System.out.print("Inputan Bilangan : ");
        bilangan = scan.nextInt();

        digit1 = bilangan/10000;
        sisa = bilangan % 10000;
        System.out.println("Digit 1 : " + digit1 + " | Sisa " + sisa);

        digit2 = sisa/1000;
        sisa = bilangan % 1000;
        System.out.println("Digit 2 : " + digit2 + " | Sisa " + sisa);

        digit3 = sisa/100;
        sisa = bilangan % 100;
        System.out.println("Digit 3 : " + digit3 + " | Sisa " + sisa);

        digit4 = sisa/10;
        sisa = bilangan % 10;
        System.out.println("Digit 4 : " + digit4 + " | Sisa " + sisa);

        digit5 = sisa/1;
        sisa = bilangan %1;
        System.out.println("Digit 5 : " + digit5 + " | Sisa " + sisa);

        reversNumber = (digit5*10000)+(digit4*1000)+(digit3*100)+(digit2*10)+(digit1*1);
        System.out.println("________________________________________");
        System.out.println("Reverses Number : "+digit5+digit4+digit3+digit2+digit1);
        System.out.println("Reverses Number : " + reversNumber);
    }
}
