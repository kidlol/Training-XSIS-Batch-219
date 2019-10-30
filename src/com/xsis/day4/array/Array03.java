package com.xsis.day4.array;

public class Array03
{
    public static void main(String[] args)
    {
        String[][] grade = new String[2][3];
        grade[0][0]= "A";
        grade[0][1]= "B";
        grade[0][2]= "C";
        grade[1][0]= "D";
        grade[1][1]= "E";
        grade[1][2]= "F";

        for (int i = 0; i < grade.length ; i++)
        {
            for (int j = 0; j <grade[i].length ; j++)
            {
                System.out.print(grade[i][j]+" | ");
            }
            System.out.println();
        }
    }
}
