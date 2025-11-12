package GCD;

import java.util.Scanner;

public class BruteForce
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        int n = Math.min(a, b);

        int gcd = 0;

        for(int i = n ; i >= 1 ; i--)
        {
            if(a % i == 0 && b % i == 0)
            {
                gcd = i;
                break;
            }
        }

        System.out.println(gcd);
    }
}
