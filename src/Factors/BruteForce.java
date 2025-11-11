package Factors;

import java.sql.SQLOutput;
import java.util.Scanner;

public class BruteForce
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        factors(n);
    }
    static void factors(int n)
    {
        for(int i = 1 ; i <= n ; i++)
        {
            if(n % i == 0)
            {
                System.out.print(i + " ");
            }
        }
    }
}
