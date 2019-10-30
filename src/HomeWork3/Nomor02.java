package HomeWork3;

public class Nomor02
{
    public static void main(String[] args)
    {
        int[][] a = new int[5][5];
        int sum = 0;

        for (int i = 0; i <a.length ; i++)
        {
            for (int j = 0; j <a.length ; j++)
            {
                if (i == 4-j)
                {
                    a[i][j] = 5;
                    sum += a[i][j];
                }
                else if (i < 4-j)
                {
                    a[i][j] = 11;
                }
                else
                {
                    a[i][j] = 88;
                }
            }
        }

        for (int i = 0; i <a.length ; i++)
        {
            for (int j = 0; j <a.length ; j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Sum : " + sum);
    }

//    static void design(int[][] a)
//    {
//        for (int i = 0; i <a.length ; i++)
//        {
//            for (int j = 0; j <a.length ; j++)
//            {
//                if (i == 4-j)
//                {
//                    a[i][j] = 5;
//                    sum += a[i][j];
//                }
//                else if (i < 4-j)
//                {
//                    a[i][j] = 11;
//                }
//                else
//                {
//                    a[i][j] = 88;
//                }
//            }
//        }
//    }
//
//    static void cetak(int[][] a)
//    {
//        for (int i = 0; i <a.length ; i++)
//        {
//            for (int j = 0; j <a.length ; j++)
//            {
//                System.out.print(a[i][j] + " ");
//            }
//            System.out.println();
//        }
//        System.out.println("Sum : " + sum);
//    }
}
