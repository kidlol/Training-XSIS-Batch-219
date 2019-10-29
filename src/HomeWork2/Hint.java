package HomeWork2;

import java.util.Scanner;

public class Hint
{
    static final String IS_NUMERIC = "[-+]?\\d+(\\.\\d+)?";
    public static void main(String[] args)
    {
        String quantityStr;
        Scanner san = new Scanner(System.in);

        System.out.print("Input Sesuatu : ");
        quantityStr = san.next();

        if (quantityStr.matches(IS_NUMERIC))
        {
            System.out.println("Yang Anda Inputkan Bilangan Numerik");
        }
        else
        {
            System.out.println("Yang Anda Inputkan Bukan Bilangan Numerik");
        }
    }
}
