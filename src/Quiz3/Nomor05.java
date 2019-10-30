package Quiz3;

public class Nomor05
{
    public static void main(String[] args)
    {
        int population = 30000;
        int year = 1;
        double expands;

        while (population <= 100000)
        {
            expands = population * .03;
            population += expands;
            year++;
        }

        System.out.println("Popilation expands until 100000 in " + year + " Year");
    }
}
