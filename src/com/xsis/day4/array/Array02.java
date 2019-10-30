package com.xsis.day4.array;

public class Array02
{
    public static void main(String[] args)
    {
        int[] a = new int[5];
        initArray(a);
        showArray(a);
        replaceArray(a);
        showArray(a);
//        replaceIndexWithParam(n,4,100);
    }

    static void initArray(int[] a)
    {
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = 5;
    }

    static void showArray(int[] a)
    {
        for (int i = 0; i < a.length ; i++)
        {
            System.out.println("Value : " + a[i]);
        }
    }

    static void replaceArray(int[] a)
    {
        System.out.println("Replace Value____");
        for (int i = 0; i <a.length ; i++)
        {
            if (a[i] == 5)
            {
                a[i] = 20;
                System.out.println("idex ke : " + i + " replace with value : " + 20);
            }
        }
    }

    static void replaceIndexWithParam(int[] n ,int serachNumber, int values)
    {
        for (int i = 0; i <n.length ; i++)
        {
            if (n[i] == serachNumber)
            {
                n[i] = values;
                System.out.println("Index Ke : " + i + " Replace with values : " + 100);

            }
        }
    }
}
