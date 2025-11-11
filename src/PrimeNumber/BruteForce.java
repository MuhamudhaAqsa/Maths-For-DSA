package PrimeNumber;

import java.util.Scanner;

public class BruteForce
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        boolean res = isPrime(n);
        System.out.println(res);
    }

    static boolean isPrime(int n)
    {
        if(n <= 1)
        {
            return false;
        }
        for(int i = 2 ; i < n ; i++)
        {
            if(n % i == 0)
            {
                return false;
            }
        }
        return true;
    }
}
