package HomeWork3;

public class Nomor01
{
    public static void main(String[] args)
    {
        int[][] a = new int[5][5];
        design(a);
        cetak(a);
    }

    static void design(int[][] a)
    {
        for (int i = 0; i <a.length ; i++)
        {
            for (int j = a.length -1 ; j >= 0 ; j--)
            {
                if (i == j)
                {
                    a[i][j] = 5;
                }
                else if (i < j)
                {
                    a[i][j] = 11;
                }
                else
                {
                    a[i][j] = 88;
                }
            }
        }
    }

    static void cetak(int[][] a)
    {
        for (int i = 0; i <a.length ; i++)
        {
            for (int j = a.length -1; j >= 0 ; j--)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
