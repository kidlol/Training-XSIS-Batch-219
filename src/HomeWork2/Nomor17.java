package HomeWork2;

import java.util.Scanner;

public class Nomor17
{
    static final String is_Numeric = "[-+]?\\d+[\\.\\d+]?";
    public static void main(String[] args)
    {
        String value;
        Scanner scan = new Scanner(System.in);

        System.out.println("Masukkan Angka : ");
        value = scan.next();

        if (value.matches(is_Numeric))
        {
            if (Integer.parseInt(value) % 5 == 0 && Integer.parseInt(value) % 8 == 0)
            {
                System.out.println("Your Value can Divide with 5 or 8");
            }
            else
            {
                System.out.println("Try to another number");
            }
        }
        else
        {
            System.out.println("Wrong type of input");
        }
    }
}
