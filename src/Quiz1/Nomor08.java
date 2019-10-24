package Quiz1;

import java.util.Scanner;

public class Nomor08
{
//    static final double price = 200000;

    public static void main(String[] args)
    {
        double price,discount,total,getDiscount;
        Scanner scan = new Scanner(System.in);
        System.out.println("Harga Barang : ");
        price = scan.nextDouble();
        System.out.print("Mendapat Discount : ");
        discount = scan.nextDouble();

        total = price - (price * discount/100);
        getDiscount = price * discount/100;

        System.out.println("Total Harga : " + total);
        System.out.println("Hemat Biaya : " + getDiscount);
    }
}
