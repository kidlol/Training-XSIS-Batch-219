package com.xsis.day4.array;

import java.sql.Array;

public class Array01
{
    public static void main(String[] args)
    {
        String[] grade = new String[4];

        grade[0] = "Hello";
        grade[1] = "Java";
        grade[2] = "Devl";
        grade[3] = "World";

        for (int i = 0; i <grade.length ; i++)
        {
            System.out.print(grade[i] + " ");
        }

        for (int i = 0; i <grade.length ; i++)
        {
            if (grade[i] == "Java")
            {
                System.out.println("Found Index ke : " +i);
            }
        }
    }
}
