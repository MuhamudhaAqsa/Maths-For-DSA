package PrimeNumber;

import java.util.Scanner;

public class Better
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i = 1 ; i <= n ; i++)
        {
            boolean res = isPrime(i);
            System.out.println(i + " " + res);
        }
    }
    static boolean isPrime(int n)
    {
        if(n <= 1)
        {
            return false;
        }
        int i = 2;
        while(i * i <= n)
        {
            if(n % i == 0)
            {
                return false;
            }
            i = i + 1;
        }
        return true;
    }
}
