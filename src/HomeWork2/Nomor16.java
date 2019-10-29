package HomeWork2;

import java.util.Scanner;

public class Nomor16
{
    public static void main(String[] args)
    {
        String score;
        Scanner scan = new Scanner(System.in);

        System.out.print("Input Your Score : ");
        score = scan.next();

        if (score.equals("A"))
        {
            System.out.println("Your Precentage Score in Range 90 - 100");
        }
        else if (score.equals("B"))
        {
            System.out.println("Your Precentage Score in Range 80 - 89");
        }
        else if (score.equals("C"))
        {
            System.out.println("Your Precentage Score in Range 70 - 79");
        }
        else if (score.equals("D"))
        {
            System.out.println("Your Precentage Score in Range 60 - 69");
        }
        else if (score.equals("E") || score.equals("F"))
        {
            System.out.println("Your Precentage Score in Range 0 - 59");
        }
        else
        {
            System.out.println("Please Contact Your Lecture or Remidial");
        }

    }
}
