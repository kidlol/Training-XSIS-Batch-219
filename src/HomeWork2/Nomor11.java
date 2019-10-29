package HomeWork2;

import java.util.Scanner;

public class Nomor11
{
    static final int minor = 6000;
    static final int major = 12000;
    public static void main(String[] args)
    {
        int travelled,miles;
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan Jarak Tempuh : ");
        travelled = scan.nextInt();

        if (travelled < minor)
        {
            miles = minor - travelled;
            System.out.println("Jarak Yang di tempuh : " + travelled + " Jarak Sisa Untuk Servis Selanjutnya : " + miles + " Servis Umum");
        }
        else if (travelled == minor)
        {
            miles = major - travelled;
            System.out.println("Jarak Yang di tempuh : " + travelled + " Waktunya Servis Umum");
        }
        else
        {
            miles = major - travelled;
            System.out.println("Jarak Yang di tempuh : " + travelled + " Jarak Sisa Untuk Servis Selanjutnya : " + miles + " Servis Utama");
        }
    }
}
