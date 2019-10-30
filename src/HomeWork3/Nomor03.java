package HomeWork3;

public class Nomor03
{
    public static void main(String[] args)
    {
        int[][] a = new int[5][5];
        int n,b=0;
        a[0][0] = 14;
        a[0][1] = 10;
        a[0][2] = 55;
        a[0][3] = 11;
        a[0][4] = 90;
        a[1][0] = 3;
        a[1][1] = 12;
        a[1][2] = 7;
        a[1][3] = 88;
        a[1][4] = 2;
        a[2][0] = 5;
        a[2][1] = 6;
        a[2][2] = 43;
        a[2][3] = 1;
        a[2][4] = 3;
        a[3][0] = 11;
        a[3][1] = 55;
        a[3][2] = 123;
        a[3][3] = 15;
        a[3][4] = 4;
        a[4][0] = 15;
        a[4][1] = 55;
        a[4][2] = 67;
        a[4][3] = 18;
        a[4][4] = 8;


        for (int i = 0; i < a.length ; i++)
        {
            for (int j = 0; j <a.length ; j++)
            {
                System.out.print(a[i][j]+" | ");
                n = a[i][j];
                if (n > b)
                {
                    b=n;
                }
            }
            System.out.println();
        }
        System.out.println(b);
    }
}
