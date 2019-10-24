package Quiz1;

import java.util.Scanner;

public class Nomor02
{
    public static void main(String[] args)
    {
        double jarkom,pemrogramanWeb,pengolahanCitraDigital,pemrogramanAndroid,jumlah,rataRata;
        Scanner scan = new Scanner(System.in);

        System.out.print("Input Nilai Jarkom :");
        jarkom = scan.nextDouble();
        System.out.print("Input Nilai Pemrograman Web :");
        pemrogramanWeb = scan.nextDouble();
        System.out.print("Input Nilai Pengolahan Citra Digital :");
        pengolahanCitraDigital = scan.nextDouble();
        System.out.print("Input Nilai Pemrograman Android :");
        pemrogramanAndroid = scan.nextDouble();

        jumlah = jarkom + pemrogramanWeb + pengolahanCitraDigital + pemrogramanAndroid;
        rataRata = jumlah/4;

        System.out.println("Jumlah Nilai Keseluruhan : " + jumlah);
        System.out.println("Rata-rata Nilai Keseluruhan : " + rataRata);
    }
}
