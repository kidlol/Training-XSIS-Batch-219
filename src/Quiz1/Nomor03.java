package Quiz1;

import java.util.Scanner;

public class Nomor03
{
    static final double tax = .7;
    static final double tips = .10;

    public static void main(String[] args)
    {
        double itemFood,itemDrink,itemEtc,total,pajak,tip,biaya;
        Scanner scan = new Scanner(System.in);
        System.out.print("Harga Makanan :");
        itemFood = scan.nextDouble();
        System.out.print("Harga Minuman :");
        itemDrink = scan.nextDouble();
        System.out.print("Harga Menu Tambahan :");
        itemEtc = scan.nextDouble();

        total = itemFood + itemDrink + itemEtc;
        pajak = total - (total * tax);
        tip = total * tips;
        biaya = total + pajak + tip;

        System.out.println("Biaya Yang di Dapat :");
        System.out.println("Total Orderan :" + total);
        System.out.println("Biaya Pajak :" + pajak);
        System.out.println("Uang Tips :" + tip);
        System.out.println("Jumlah Biaya :" + biaya);
    }
}
