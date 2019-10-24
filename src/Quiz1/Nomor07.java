package Quiz1;

import java.util.Scanner;

public class Nomor07
{
    static final double tax = .20;

    public static void main(String[] args)
    {
        double itemPrice1,itemPrice2,itemPrice3,total,pajak,rataTotal,rataPajak;
        Scanner scan = new Scanner(System.in);
        System.out.print("Harga Barang 1 :");
        itemPrice1 = scan.nextDouble();
        System.out.print("Harga Barang 2 :");
        itemPrice2 = scan.nextDouble();
        System.out.print("Harga Barang 3 :");
        itemPrice3 = scan.nextDouble();

        total = itemPrice1 + itemPrice2 + itemPrice3;
        pajak = total + (itemPrice1 * tax) + (itemPrice2 * tax) + (itemPrice3 * tax) ;
        rataTotal = total / 3;
        rataPajak = pajak / 3;


        System.out.println("Biaya Yang di Dapat :");
        System.out.println("Total Harga : " + total);
        System.out.println("Total Harga dengan Pajak : " + pajak);
        System.out.println("Rata-rata Total Harga : " + rataTotal);
        System.out.println("Rata-rata Total Harga dengan Pajak : " + rataPajak);

    }
}
